package com.company;
import java.util.Scanner;

public class createAccount {
    public static arrayList array;
    private static Scanner scanner = new Scanner(System.in);
    private String accountName;
    private String pin;

    public createAccount(String fullName, String pin){
        this.accountName = fullName;
        this.pin = pin;
    }

    public static void optionChosen(){
        System.out.println("Enter your full name: ");
        String name = scanner.nextLine();
        System.out.println("Enter the password you want to use for this account");
        String pin = scanner.nextLine();
        createAccount newAccount = new createAccount(name,pin);
        array.addAccountList(newAccount);
    }



}
