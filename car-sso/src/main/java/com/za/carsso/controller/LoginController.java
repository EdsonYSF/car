
package com.za.carsso.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;

@Controller
public class LoginController {


    @GetMapping("/login")
    public String login() {
        return "login";
    }



    @GetMapping("/user")
    public ResponseEntity<Object> userPage(Principal principal) {
        return new ResponseEntity<Object>(principal, HttpStatus.OK);
    }
}
