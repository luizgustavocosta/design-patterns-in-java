package com.gof.structural.proxy;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.TimeUnit;

@Slf4j
public class Client {

    private final AccountService service;

    public Client(AccountService service) {
        this.service = service;
    }

    public static void main(String[] args) throws InterruptedException {
        // In a real scenario this should be provide by @Inject or @Autowired
        Client client = new Client(new AccountProxy(null));
    }
}
