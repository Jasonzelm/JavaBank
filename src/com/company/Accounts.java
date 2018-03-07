package com.company;

import java.util.Scanner;


public class Accounts {

    accntNumArry array = new accntNumArry();
    private Scanner in = new Scanner(System.in);
    int accountNum;
    int pinNum;
    double withdrawAmount;
    double depositAmount;
    int intScanner;
    String stringScanner;
    int arrayNum;
    int n;

    public Accounts(){
        accntNumArry account = new accntNumArry();

        // ask for the account number with the scanner
        System.out.println("Enter your account number here: ");
        this.intScanner = in.nextInt();
       //figure out how to make it look for the account number through an array
        //or(n : array.accntArray()) {

            if (this.intScanner == n) {
                System.out.println("We found your account");
            } else {
                System.out.println("Your account doesnt seem to exist");
            }
        //}
        //ask for the account name(ex: Account1, Account2, etc) then set it to an account number here
        System.out.println("Enter the account name (ex: Account1, Account2, etc): ");
        this.stringScanner = in.nextLine();
    }


}
