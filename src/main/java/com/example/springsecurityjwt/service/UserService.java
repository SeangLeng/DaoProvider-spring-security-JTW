package com.example.springsecurityjwt.service;


import com.example.springsecurityjwt.model.UserModel;
import com.example.springsecurityjwt.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService implements UserDetailsService {
    private final UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        UserModel user = userRepository.getAllUser(email);
        return User.builder()
                .username(user.getEmail())
                .password(user.getPassword())
                .roles("USER")
                .build();


    }
}
