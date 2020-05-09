package com.udacity.intotojava;

public class Main {

    public static void main(String[] args) {


        CertificateOfDeposit cd = new CertificateOfDeposit("123",12.0,0);
        CheckingAccount ca = new CheckingAccount();
	    SavingsAccount sa = new SavingsAccount();
	    System.out.println("Bankaccount no : "+cd.account);


    }
}
