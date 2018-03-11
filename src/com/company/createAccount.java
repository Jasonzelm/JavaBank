package com.company;
import java.util.Scanner;

public class createAccount {
    private static Scanner scanner = new Scanner(System.in);
    String accountName1;
    int pinNum1;

    public createAccount(String accountName, int pinNum){
        this.accountName1 = accountName;
        this.pinNum1 = pinNum;
    }

    public String getAccountName() {
        return accountName1;
    }

    public int getPinNum() {
        return pinNum1;
    }

    public static createAccount setAccount(String accountName, int pinNum){
        return new createAccount(accountName, pinNum);
    }

    public static void optionChosen(){
        System.out.println("Enter your full name, this will be the name under your account");
        String accntName = scanner.nextLine();
        System.out.println("enter a pin number, this will be your pin number for your account");
        int pinNum = scanner.nextInt();
        setAccount(accntName,pinNum);
    }
}
