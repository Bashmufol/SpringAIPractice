package com.bash.springaipractice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/openai")
public class OpenAIController {

    @GetMapping("/{message}")
    public ResponseEntity<String> getAnswer(@PathVariable String message){
        return  ResponseEntity.ok().body("Hello World");
    }
}
