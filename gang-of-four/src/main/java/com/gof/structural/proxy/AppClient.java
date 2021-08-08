package com.gof.structural.proxy;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.TimeUnit;

@Slf4j
public class AppClient {

    private final AccountService service;

    public AppClient(AccountService service) {
        this.service = service;
    }

    public static void main(String[] args) throws InterruptedException {
        // In a real scenario this should be provide by @Inject or @Autowired
        AppClient client = new AppClient(new AccountProxy(new AccountRealSubject(InMemory.INSTANCE)));

        log.info("Let's open a new account for Luiz and Louis");
        var iban = client.openDigitalAccount("Luiz", "Louis");

        log.info("Time to save money....");
        TimeUnit.SECONDS.sleep(5);

        if (client.closeDigitalAccount(iban)) {
            log.info("Now, the account is closed");
        }

    }

    private String openDigitalAccount(String... owners) {
        return service.open(owners);
    }

    private boolean closeDigitalAccount(String iban) {
        return service.close(iban);
    }
}
