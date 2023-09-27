package com.authen.AuthenWeb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.authen.AuthenWeb.entity.account;
import com.authen.AuthenWeb.service.accountService;

@RestController
@RequestMapping("/account")
public class controllerAccount {
    
    @Autowired
    private accountService accService;

    @PostMapping("/create")
    private account createAccount(@RequestBody account acc){
        return accService.createAccount(acc);
    }

    @GetMapping("/list")
    private List<account> accList() {
        return accService.accList();
    }

    @DeleteMapping("/delete")
    private String accDeleteById(@PathVariable("id") int id) {
        accService.accDeleteById(id);
        return "Deleted successfully";
    }

}
