package com.gof.structural.proxy;

interface AccountService {

    String open(String... owners);
    boolean close(String iban);

}
