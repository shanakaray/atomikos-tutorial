package com.yr.atomikos.banking.controller;

import com.yr.atomikos.banking.dao.AccountDAO;
import com.yr.atomikos.banking.entity.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController("/account")
public class AccountController {

    @Autowired
    private AccountDAO accountDAO;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public Optional<Account> getAccount(@RequestParam("account-number") String accountNumber) {
        return accountDAO.findById(accountNumber);
    }

    public Account createAccount(){

    }

}
