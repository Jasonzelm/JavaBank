package com.company;

import java.util.Scanner;


public class Accounts {

    accntNumArry array;
    private Scanner in = new Scanner(System.in);
    int accountNum;
    int pinNum;
    double withdrawAmount;
    double depositAmount;
    long intScanner;
    String stringScanner;
    int arrayNum;

    public Accounts(){

        // ask for the account number with the scanner
        System.out.println("Enter your account number here: ");
        this.intScanner = in.nextLong();

       //look for the account number through an array in accntNumarry class
        for(long n : array.accntNums)

            if (this.intScanner == n) {
                System.out.println("We found your account");
            } else if(this.intScanner != n) {
                System.out.println("Your account doesnt seem to exist");
            }



    }


}
