package com.gof.structural.proxy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AccountRealSubject implements AccountService {

    private final AccountRepository repository;

    public AccountRealSubject(AccountRepository repository) {
        this.repository = repository;
    }

    @Override
    public String open(String... owners) {
        log.info("Hi there! I'm real subject, let's create an account for you");
        return repository.save(owners);
    }

    @Override
    public boolean close(String iban) {
        log.info("Hi there! I'm real subject, let's close the account for you");
        return repository.close(iban);
    }
}
