package com.comparus.test.task.controller.api;

import java.util.List;

import org.springframework.validation.annotation.Validated;

import com.comparus.test.task.controller.dto.UserDto;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

@Validated
@Tag(name = "User Api")
public interface UserApi {

    @Operation(summary = "Get Aggregated Users")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Successful get users"),
            @ApiResponse(responseCode = "400", description = "Bad request"),
            @ApiResponse(responseCode = "401", description = "JWT is not valid"),
            @ApiResponse(responseCode = "403", description = "Not appropriate permissions"),
            @ApiResponse(responseCode = "500", description = "Internal server error")
    })
    List<UserDto> getUsers();


}
