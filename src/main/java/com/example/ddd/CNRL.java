package com.example.ddd;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CNRL {

    @GetMapping("/rest")
    public String check(){
        return "<h1>Hello There</h1>";
    }
    @GetMapping("/sum")
    public int sum(int num1,int num2){
        return num1+num2;
    }

}
