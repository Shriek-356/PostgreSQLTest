package com.vdk.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import java.security.Principal;

@Controller
public class UserController {

    @GetMapping("/login")
    public String loginView( ){
        return "login";
    }
}
