package com.company;
import java.util.Scanner;

public class createAccount {
    private static Scanner scanner = new Scanner(System.in);
    int accountNum1;
    int pinNum1;

    public createAccount(int accountNum, int pinNum){
        this.accountNum1 = accountNum;
        this.pinNum1 = pinNum;
    }

    public int getAccountNum() {
        return accountNum1;
    }

    public int getPinNum() {
        return pinNum1;
    }

    public static createAccount setAccount(int accountNum, int pinNum){
        return new createAccount(accountNum, pinNum);
    }

    public static void optionChosen(){
        System.out.println("Enter a 6 digit number, this will be your account number");
        int accntNum = scanner.nextInt();
        System.out.println("enter a 3 digit number, this will be your pin number");
        int pinNum = scanner.nextInt();
    }
}
