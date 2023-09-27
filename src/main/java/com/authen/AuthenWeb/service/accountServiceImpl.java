package com.authen.AuthenWeb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.authen.AuthenWeb.entity.account;
import com.authen.AuthenWeb.repository.accountRepository;

@Service
public class accountServiceImpl implements accountService {

    @Autowired
    private accountRepository accRepository;

    @Override
    public account createAccount(account acc) {
        return accRepository.save(acc);
    }

    @Override
    public List<account> accList() {
        return (List<account>) 
            accRepository.findAll();

    }

    @Override
    public void accDeleteById(int id) {
        accRepository.deleteById(id);
    }
    
}
