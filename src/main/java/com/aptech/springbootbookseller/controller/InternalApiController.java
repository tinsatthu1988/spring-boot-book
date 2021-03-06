package com.aptech.springbootbookseller.controller;

import com.aptech.springbootbookseller.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("http://localhost:4200")
@RequestMapping("api/internal")//pre-path
public class InternalApiController
{
    @Autowired
    private IUserService userService;

    @PutMapping("make-admin/{username}") //api/internal/make-admin/{username}
    public ResponseEntity<?> makeAdmin(@PathVariable String username)
    {
        userService.makeAdmin(username);

        return new ResponseEntity<>(HttpStatus.OK);
    }
}
