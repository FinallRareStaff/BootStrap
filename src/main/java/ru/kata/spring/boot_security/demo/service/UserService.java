package ru.kata.spring.boot_security.demo.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import ru.kata.spring.boot_security.demo.model.User;

public interface UserService extends UserDetailsService {

    User findByUserEmail(String email);

    @Override
    UserDetails loadUserByUsername(String username) throws UsernameNotFoundException;
}
