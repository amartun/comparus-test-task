package com.comparus.test.task.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.comparus.test.task.controller.dto.UserDto;
import com.comparus.test.task.service.UserService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {


    @Override
    public List<UserDto> getUsers() {
        return List.of();
    }

}
