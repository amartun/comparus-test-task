package com.comparus.test.task.service;

import java.util.List;

import com.comparus.test.task.controller.dto.UserDto;

public interface UserAggregationService {

    List<UserDto> getUsers();

}
