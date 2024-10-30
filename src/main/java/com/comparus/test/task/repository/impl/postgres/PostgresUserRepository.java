package com.comparus.test.task.repository.impl.postgres;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.comparus.test.task.repository.UserRepository;
import com.comparus.test.task.repository.entity.UserEntity;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Repository
@RequiredArgsConstructor
public class PostgresUserRepository implements UserRepository {

    private static final String ID = "user_id";
    private static final String NAME = "first_name";
    private static final String SURNAME = "surname";
    private static final String USERNAME = "last_name";

    @Override
    public List<UserEntity> findAllUsers() {
        return List.of(buildUserEntity());
    }

    @Override
    public String getStrategy() {
        return "postgres";
    }

    private UserEntity buildUserEntity() {
        return UserEntity.builder()
                .id(ID)
                .name(NAME)
                .username(USERNAME)
                .surname(SURNAME)
                .build();
    }

}