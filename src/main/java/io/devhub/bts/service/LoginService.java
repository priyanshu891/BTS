package io.devhub.bts.service;

import io.devhub.bts.model.Login;
import io.devhub.bts.repository.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LoginService {

    @Autowired
    private LoginRepository loginRepository;

    public void addLogin(Login login){
        loginRepository.save(login);
    }

    public List<Login> getAllUsers() {
        List<Login> users = new ArrayList<>();
        loginRepository.findAll().forEach(users::add);
        return users;
    }
}
