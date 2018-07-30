package com.bhagya.controller;

import com.bhagya.Service.IdentificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class ServiceController {
    @Autowired
    IdentificationService identificationService;

    @RequestMapping(value = "/identify", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public String identify(@RequestParam Map<String, String> urlParams){
        return identificationService.identify(urlParams);
    }
}
