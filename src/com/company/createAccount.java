package com.company;

public class createAccount {
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
}
