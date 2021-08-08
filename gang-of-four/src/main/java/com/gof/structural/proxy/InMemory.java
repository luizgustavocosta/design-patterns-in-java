package com.gof.structural.proxy;

import lombok.extern.slf4j.Slf4j;

import java.time.ZonedDateTime;
import java.util.*;
import java.util.stream.Collectors;

import static java.util.Objects.nonNull;

@Slf4j
class InMemory implements AccountRepository {

    protected static final InMemory INSTANCE;

    static {
        INSTANCE = new InMemory(new HashMap<>());
    }

    private final Map<String, AccountDetails> accounts;

    private InMemory(Map<String, AccountDetails> accounts) {
        this.accounts = accounts;
    }

    public String save(String... owners) {
        var iban = UUID.randomUUID().toString();
        log.info("New iban created {}", iban);
        var accountDetails = AccountDetails.builder()
                .owners(List.of(owners))
                .iban(iban)
                .active(true)
                .memberSince(ZonedDateTime.now())
                .build();
        accounts.put(iban, accountDetails);
        return iban;
    }

    public boolean close(String iban) {
        log.info("The account {} will be closed.", iban);
        return nonNull(accounts.remove(iban));
    }

    public List<AccountDetails> findAll() {
        return accounts.values().stream().collect(Collectors.toUnmodifiableList());
    }

    public Optional<AccountDetails> findById(String id) {
        return Optional.ofNullable(accounts.get(id));
    }

}
