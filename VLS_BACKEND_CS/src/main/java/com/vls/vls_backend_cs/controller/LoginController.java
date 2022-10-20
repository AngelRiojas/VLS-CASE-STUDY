package com.vls.vls_backend_cs.controller;

import com.vls.vls_backend_cs.entity.LoginEntity;
import com.vls.vls_backend_cs.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class LoginController {
    @Autowired
    LoginService loginService;

    @GetMapping("/api/v1/login")
    public List<LoginEntity> getLoginList() {
        return loginService.getLoginList();
    }

    @PostMapping("/api/v1/login")
    public LoginEntity getLoginById(@RequestBody LoginEntity loginEntity) {
        return loginService.getLoginById(loginEntity);
    }
}
