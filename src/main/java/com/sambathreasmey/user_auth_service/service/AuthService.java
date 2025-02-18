package com.sambathreasmey.user_auth_service.service;

import com.sambathreasmey.user_auth_service.dto.RegisterDTO;
import com.sambathreasmey.user_auth_service.dto.RegisterResponse;

public interface AuthService {
    RegisterResponse register(RegisterDTO registerDTO);
}
