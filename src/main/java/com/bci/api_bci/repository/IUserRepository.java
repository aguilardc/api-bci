package com.bci.api_bci.repository;

import com.bci.api_bci.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<User, String> {
    User findByEmail(String Email);
}
