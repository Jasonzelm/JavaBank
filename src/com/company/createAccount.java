package com.company;
import java.util.Scanner;

public class createAccount {
    public arrayList array;
    private static Scanner scanner = new Scanner(System.in);
    String accountName1;
    String pin;

    public createAccount(String accountName, String pin){
        this.accountName1 = accountName;
        this.pin = pin;
    }

    public String getAccountName() {
        return accountName1;
    }

    public String getPin() {
        return pin;
    }

    public static createAccount setAccount(String accountName, String pin){
        return new createAccount(accountName, pin);
    }

    public static void optionChosen(){
        System.out.println("Enter your full name, this will be the name under your account");
        String accntName = scanner.nextLine();
        System.out.println("enter a password, this will be the password for your account");
        String pin = scanner.nextLine();
        if(array.findAccount(account)>=0)


    }
}
