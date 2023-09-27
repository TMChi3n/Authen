package com.authen.AuthenWeb.service;


import java.util.List;

import org.springframework.stereotype.Service;

import com.authen.AuthenWeb.entity.account;

@Service
public interface accountService {

    account createAccount(account acc);

    List<account> accList();

    void accDeleteById(int id);
}
