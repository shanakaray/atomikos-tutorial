package com.yr.atomikos.banking.controller;

import com.yr.atomikos.banking.entity.Account;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class AccountController {

    public Optional<Account> getAccount(String accountNumber){
        return Optional.empty();
    }

}
