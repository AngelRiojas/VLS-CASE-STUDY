package com.vls.vls_backend_cs.service;

import com.vls.vls_backend_cs.entity.LoginEntity;

import java.util.List;

public interface LoginService {
    public List<LoginEntity> getLoginList();

    public LoginEntity getLoginById(LoginEntity userEntity);
}
