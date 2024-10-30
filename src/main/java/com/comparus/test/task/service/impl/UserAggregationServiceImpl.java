package com.comparus.test.task.service.impl;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.comparus.test.task.configuration.properties.DataSourceProperties;
import com.comparus.test.task.controller.dto.UserDto;
import com.comparus.test.task.mapper.UserMapper;
import com.comparus.test.task.repository.UserRepository;
import com.comparus.test.task.service.UserAggregationService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserAggregationServiceImpl implements UserAggregationService {

    private final List<UserRepository> userRepositories;
    private final DataSourceProperties dataSourceProperties;
    private final UserMapper userMapper;

    @Override
    public List<UserDto> getUsers() {
        var availableStrategies = extractStrategies();
        return userRepositories.stream()
                .filter(repository -> availableStrategies.contains(repository.getStrategy()))
                .flatMap(repository -> repository.findAllUsers().stream())
                .map(userMapper::toDTO)
                .toList();
    }

    private Set<String> extractStrategies() {
        return dataSourceProperties.getSources().stream()
                .map(DataSourceProperties.DataSourceConfig::getStrategy)
                .collect(Collectors.toSet());
    }
}