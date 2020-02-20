package com.demoAngular.service;

import java.util.List;

import com.demoAngular.dto.UsersDto;
import org.springframework.stereotype.Service;

import com.demoAngular.entity.Users;

@Service
public interface UserService {
    public List<UsersDto> getUsersById(long userId);
    public List<UsersDto> getAllUsers();
    public Users save(Users user);
    public Users findByUsLogin(String usLogin);
}
