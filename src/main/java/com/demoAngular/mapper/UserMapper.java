package com.demoAngular.mapper;

import com.demoAngular.dto.UsersDto;
import org.mapstruct.Mapper;

import com.demoAngular.entity.Users;

@Mapper(componentModel = "spring")
public interface UserMapper {
 
    UsersDto usersToUsersDto(Users user);
    Users usersDtoTousers(UsersDto user);
}
