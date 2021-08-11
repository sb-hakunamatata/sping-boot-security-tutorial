package com.tutorial.authentication.authservice.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AuthenticationController {
   // authenticate (return JWT token, not authorized),
   // authorize(request, JWT Token, Authorized),
   // sendOTP(phoneNumber, not authorized)

    // Problem with forwarding request from Authentication service to backend services.
    // Benefits.
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<String> HelloWorld() {
        return new ResponseEntity<>("Hello World", HttpStatus.OK);
    }

}
