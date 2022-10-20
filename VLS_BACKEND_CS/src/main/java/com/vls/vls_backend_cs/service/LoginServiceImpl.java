package com.vls.vls_backend_cs.service;

import com.vls.vls_backend_cs.entity.LoginEntity;
import com.vls.vls_backend_cs.repository.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    private LoginRepository loginRepository;


    @Override
    public List<LoginEntity> getLoginList() {
        return loginRepository.findAll();
    }

    @Override
    public LoginEntity getLoginById(LoginEntity loginEntity) {
        LoginEntity loginEntityFromDb = loginRepository.findByLoginId(loginEntity.getLoginId());
        if(loginEntity.getLoginId().equals(loginEntityFromDb.getLoginId()) && loginEntity.getLoginPassword().equals(loginEntityFromDb.getLoginPassword())) {
            loginEntityFromDb.setLoginPassword(" ");
            return loginEntityFromDb;
        }
        return null;
    }
}
