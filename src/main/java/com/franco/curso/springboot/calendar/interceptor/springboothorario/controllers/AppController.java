package com.andres.curso.springboot.calendar.interceptor.springboothorario.controllers;

// import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class AppController {
    
    @GetMapping("/foo")
    public ResponseEntity<?> foo(HttpServletRequest request) {

        // Calendar calendar = Calendar.getInstance();
        // int hour = calendar.get(Calendar.HOUR_OF_DAY);

        Map<String, Object> data = new HashMap<>();
        data.put("title", "Bienvenidos al sistema de atencion!");
        // data.put("time", hour);
        data.put("time", new Date().toString());
        data.put("message", request.getAttribute("message"));
        return ResponseEntity.ok(data);
    }
}
