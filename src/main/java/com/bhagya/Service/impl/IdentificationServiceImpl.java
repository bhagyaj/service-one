package com.bhagya.Service.impl;

import com.bhagya.Service.IdentificationService;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class IdentificationServiceImpl implements IdentificationService {
    @Override
    public String identify(Map<String, String> urlParams) {
        String name = urlParams.get("name");
        String gender = urlParams.get("gender");
        if (gender.equalsIgnoreCase("M")){
            return "Mr "+name;
        }else if (gender.equalsIgnoreCase("F")){
            return "Ms "+name;
        }
        return null;
    }
}
