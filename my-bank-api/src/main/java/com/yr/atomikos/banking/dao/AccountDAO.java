package com.yr.atomikos.banking.dao;

import com.yr.atomikos.banking.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;
import java.util.Optional;


public interface AccountDAO extends JpaRepository<Account,String> {

    @Transactional(Transactional.TxType.SUPPORTS)
    Optional<Account> findById(String id);

    @Transactional(Transactional.TxType.REQUIRED)
    @Override
    Account save(Account account);
}
