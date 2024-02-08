package com.github.actions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GithubActionsWorkflowApplication {

    public static void main(String[] args) {
        SpringApplication.run(GithubActionsWorkflowApplication.class, args);
    }

    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome To Docker Image";
    }

}
