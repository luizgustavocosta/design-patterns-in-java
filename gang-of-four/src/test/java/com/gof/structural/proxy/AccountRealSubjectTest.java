package com.gof.structural.proxy;

import org.assertj.core.api.WithAssertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
@DisplayName("Real subject")
class AccountRealSubjectTest implements WithAssertions {

    AccountRealSubject account;
    AccountRepository repository;

    @BeforeEach
    void setUp(@Mock AccountRepository repository) {
        this.repository = repository;
        this.account = new AccountRealSubject(repository);
    }

    @Test
    void open() {
        String[] owners = new String[]{"Clark Kent", "Kent Beck"};
        account.open(owners);
        verify(repository, times(1)).save(owners);
    }

    @Test
    void close() {
        var iban = "TUS";
        account.close(iban);
        verify(repository, times(1)).close(iban);
    }
}