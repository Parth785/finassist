package com.finassist.authservice.service;

import com.finassist.authservice.dto.RegisterRequest;
import com.finassist.authservice.entity.User;

public interface AuthService {
    User register(RegisterRequest request);
}
