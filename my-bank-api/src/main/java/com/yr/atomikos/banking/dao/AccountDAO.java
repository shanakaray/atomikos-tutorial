package com.yr.atomikos.banking.dao;

import com.yr.atomikos.banking.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountDAO extends JpaRepository<String, Account> {
}
