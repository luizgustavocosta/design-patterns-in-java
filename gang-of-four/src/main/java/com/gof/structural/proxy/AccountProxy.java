package com.gof.structural.proxy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AccountProxy implements AccountService {

    private AccountRealSubject account;

    public AccountProxy(AccountRealSubject account) {
        this.account = account;
    }

    @Override
    public String open(String... owners) {
        log.info("Proxy is a proxy, needs to request the operation open to real subject");
        return account.open(owners);
    }

    @Override
    public boolean close(String iban) {
        log.info("Proxy is a proxy, needs to request the operation close to real subject");
        return account.close(iban);
    }
}
