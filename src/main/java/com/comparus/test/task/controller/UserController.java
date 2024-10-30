package com.comparus.test.task.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.comparus.test.task.controller.api.UserApi;
import com.comparus.test.task.controller.dto.UserDto;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequestMapping(value = "/users")
@RestController
@RequiredArgsConstructor
public class UserController implements UserApi {


    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    @Override
    public List<UserDto> getUsers() {
        return List.of();
    }


}
