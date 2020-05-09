package com.udacity.intotojava;

public class CertificateOfDeposit extends BankAccount{
    int expiry;

    CertificateOfDeposit(String acct , Double bl , int expiry){
        this.account = acct;
        this.balance = bl;
        this.expiry = expiry;
    }
}
