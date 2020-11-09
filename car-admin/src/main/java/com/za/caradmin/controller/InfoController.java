
package com.za.caradmin.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;

@Controller
public class InfoController {

    @GetMapping("/getUser")
    public ResponseEntity<Object> userPage(Principal principal) {
        return new ResponseEntity<Object>(principal, HttpStatus.OK);
    }

    @GetMapping("/")
    public String indexPage() {
        return "index";
    }
}
