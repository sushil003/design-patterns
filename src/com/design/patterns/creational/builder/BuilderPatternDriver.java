package com.design.patterns.creational.builder;

/**
 * @author Sushil
 */
public class BuilderPatternDriver {

    public static void main(String[] args) {
        BankAccount newAccount = new BankAccount
                .BankAccountBuilder("Sushil", "22738022275")
                .withEmail("sushil@example.com")
                .wantNewsletter(true)
                .build();

        System.out.println("Name: " + newAccount.getName());
        System.out.println("AccountNumber:" + newAccount.getAccountNumber());
        System.out.println("Email: " + newAccount.getEmail());
        System.out.println("Want News letter?: " + newAccount.isNewsletter());
    }
}
