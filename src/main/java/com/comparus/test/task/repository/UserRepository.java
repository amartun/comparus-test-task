package com.comparus.test.task.repository;

import java.util.List;

import com.comparus.test.task.repository.entity.UserEntity;

public interface UserRepository {

    List<UserEntity> findAllUsers();

    String getStrategy();


}
