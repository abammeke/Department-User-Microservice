package com.webnet.fallback;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackController {

    @GetMapping("/userServiceFallback")
    public String userServiceFallback(){
        return "User service is taking longer than expected\nPlease try again later !";
    }

    @GetMapping("/departmentServiceFallback")
    public String departmentServiceFallback(){
        return "Department service is taking longer than expected\nPlease try again later !";
    }

}
