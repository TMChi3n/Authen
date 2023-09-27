package com.authen.AuthenWeb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.authen.AuthenWeb.entity.account;

@Repository
public interface accountRepository extends JpaRepository<account, Integer>{
    
}
