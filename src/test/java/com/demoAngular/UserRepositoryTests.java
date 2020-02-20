package com.demoAngular;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.demoAngular.entity.Users;
import com.demoAngular.repository.UserRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserRepositoryTests {

    @Autowired
    UserRepository userRepository;
	
    @Test
    public void findByUsLogin() {
        Users us = new Users();
        us.setUsLogin("admin");
        
        Users found = userRepository.findByUsLogin(us.getUsLogin());
        
        assertThat(found.getUsLogin())
          .isEqualTo(us.getUsLogin());
    }

}
