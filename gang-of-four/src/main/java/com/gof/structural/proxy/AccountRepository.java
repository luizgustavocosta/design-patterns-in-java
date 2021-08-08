package com.gof.structural.proxy;

import java.util.List;
import java.util.Optional;

interface AccountRepository {

    String save(String... owners);
    boolean close(String iban);
    List<AccountDetails> findAll();
    Optional<AccountDetails> findById(String id);
}
