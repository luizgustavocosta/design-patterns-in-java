package com.gof.structural.proxy;

import org.assertj.core.api.WithAssertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

@DisplayName("In memory store")
class InMemoryTest implements WithAssertions {

    private InMemory store;

    @BeforeEach
    void setUp() {
        store = InMemory.INSTANCE;
        store.findAll().forEach(accountDetails -> store.close(accountDetails.getIban()));
    }

    @Test
    void save() {
        List<AccountDetails> allAccounts = store.findAll();
        var iban = store.save("John Doe", "Joao sem bracos");
        Optional<AccountDetails> accountDetails = store.findById(iban);

        assertThat(allAccounts.size()).isLessThan(store.findAll().size());
        assertThat(accountDetails.orElseThrow(IllegalStateException::new)).hasNoNullFieldsOrProperties();
    }

    @Test
    void close() {
        List<AccountDetails> allAccounts = store.findAll();
        var iban = store.save("He-Man", "Prince Adam");
        assertThat(store.findById(iban)).isNotEmpty();
        store.close(iban);
        assertThat(store.findById(iban)).isEmpty();
    }
}