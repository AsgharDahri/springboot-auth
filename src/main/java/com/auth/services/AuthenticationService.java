package com.auth.services;

import com.auth.dtos.JwtAuthenticationResponse;
import com.auth.dtos.SigninRequest;
import com.auth.entities.User;

public interface AuthenticationService {
    User signup(User user);
    JwtAuthenticationResponse signin(SigninRequest signinRequest);
}
