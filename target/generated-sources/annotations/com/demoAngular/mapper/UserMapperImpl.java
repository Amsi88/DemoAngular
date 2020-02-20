package com.demoAngular.mapper;

import com.demoAngular.dto.UsersDto;
import com.demoAngular.entity.Users;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-02-20T12:16:57+0100",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_201 (Oracle Corporation)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public UsersDto usersToUsersDto(Users user) {
        if ( user == null ) {
            return null;
        }

        UsersDto usersDto = new UsersDto();

        usersDto.setUsId( user.getUsId() );
        usersDto.setUsLogin( user.getUsLogin() );
        usersDto.setUsPassword( user.getUsPassword() );
        usersDto.setUsRol( user.getUsRol() );
        usersDto.setUsName( user.getUsName() );
        usersDto.setUsLastName( user.getUsLastName() );

        return usersDto;
    }

    @Override
    public Users usersDtoTousers(UsersDto user) {
        if ( user == null ) {
            return null;
        }

        Users users = new Users();

        users.setUsId( user.getUsId() );
        users.setUsLogin( user.getUsLogin() );
        users.setUsPassword( user.getUsPassword() );
        users.setUsRol( user.getUsRol() );
        users.setUsName( user.getUsName() );
        users.setUsLastName( user.getUsLastName() );

        return users;
    }
}
