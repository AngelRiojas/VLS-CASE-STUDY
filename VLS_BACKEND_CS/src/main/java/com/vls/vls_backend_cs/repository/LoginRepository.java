package com.vls.vls_backend_cs.repository;

import com.vls.vls_backend_cs.entity.LoginEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginRepository extends JpaRepository<LoginEntity, String> {
    LoginEntity findByLoginId(String loginId);
}
