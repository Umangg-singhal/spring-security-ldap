package io.javabrains.springsecurityldap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResource {

    @GetMapping("/")
    public String index(){
        System.out.println("I am using Jenkins");
        return "New Home Page";
    }
}
