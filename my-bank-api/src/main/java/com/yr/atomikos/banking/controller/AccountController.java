package com.yr.atomikos.banking.controller;

import com.yr.atomikos.banking.dao.AccountDAO;
import com.yr.atomikos.banking.entity.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Account createAccount(@RequestBody Account account){
        return accountDAO.save(account);
    }

}
