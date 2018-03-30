package com.ocularminds.kubernete.account.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ocularminds.kubernete.account.model.Account;

public interface AccountRepository extends MongoRepository<Account, String> {

    public Account findByNumber(String number);
    public List<Account> findByCustomerId(String customerId);
    
}
