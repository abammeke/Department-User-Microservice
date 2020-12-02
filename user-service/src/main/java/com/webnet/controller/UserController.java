package com.webnet.controller;

import com.webnet.entity.User;
import com.webnet.service.UserService;
import com.webnet.vo.ResponseTemplateVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/")
    public User saveUser(@RequestBody User user){
        log.info("inside saveDepartment of DepartmentController");
        return userService.saveUser(user);
    }

    @GetMapping("/{id}")
    public ResponseTemplateVO getUser(@PathVariable("id") Long userId){
        log.info("inside Get User with Department Info in user Controller");
        return userService.getUserWithDepartment(userId);
    }
}
