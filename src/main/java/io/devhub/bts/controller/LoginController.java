package io.devhub.bts.controller;

import io.devhub.bts.model.Login;
import io.devhub.bts.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LoginController {

    @Autowired
    private LoginService loginService;

    @RequestMapping("/users")
    public List<Login> getAllTopics() {
        return loginService.getAllUsers();
    }

    @RequestMapping(method=RequestMethod.POST,value="/users")
    public void addLogin(@RequestBody Login login){
        BCryptPasswordEncoder p=new BCryptPasswordEncoder();
        login.setPassword(p.encode(login.getPassword()));
        loginService.addLogin(login);
    }




}
