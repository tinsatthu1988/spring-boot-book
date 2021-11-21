package com.aptech.springbootbookseller.service;

import com.aptech.springbootbookseller.model.User;

public interface IAuthenticationService {
    User signInAndReturnJWT(User signInRequest);
}
