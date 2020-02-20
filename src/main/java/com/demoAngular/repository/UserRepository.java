package com.demoAngular.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.demoAngular.entity.Users;

@Repository
public interface UserRepository extends CrudRepository<Users, Long> {
    public List<Users> findByUsId(long userId);
    public List<Users> findAll();
    public Users findByUsLogin(String usLogin);
}