package com.auth.services;

import com.auth.services.impl.UserServiceImpl;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService  {
    UserDetailsService userDetailService();

}
