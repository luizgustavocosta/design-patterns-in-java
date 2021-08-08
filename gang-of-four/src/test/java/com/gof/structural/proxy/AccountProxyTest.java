package com.gof.structural.proxy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.*;

@DisplayName("Proxy test")
@ExtendWith(MockitoExtension.class)
class AccountProxyTest {

    AccountProxy proxy;
    AccountService realSubject;

    @BeforeEach
    void setUp(@Mock AccountRealSubject accountRealSubject) {
        this.realSubject = accountRealSubject;
        proxy = new AccountProxy(accountRealSubject);
    }

    @Test
    void open() {
        String[] owners = new String[] {"Cleveland Brow", "Cleveland Junior"};
        proxy.open(owners);
        verify(realSubject, times(1)).open(owners);
    }

    @Test
    void close() {
        var iban = "My marvelous IBAN";
        proxy.close(iban);
        verify(realSubject, never()).open(iban);
        verify(realSubject, times(1)).close(iban);
    }
}