package com.company;

import java.util.Scanner;

public class Accounts {

    private Scanner in = new Scanner(System.in);
    private int accountNum;
    private int pinNum;
    private double withdrawAmount;
    private double depositAmount;
    private int intScanner;
    private String stringScanner;
    private int arrayNum;
    private int entrdAccntNum;

    private int Account1 = 26028422;
    private int Account2 = 0;
    private int Account3 = 0;
    private int Account4 = 0;
    private int Account5 = 0;
    private int Account6 = 0;
    private int Account7 = 0;
    private int Account8 = 0;
    private int Account9 = 0;
    private int Account10 = 0;
    private int Account11 = 0;

    public Accounts(){
        // ask for the account number with the scanner the redirct to accntArray class
        System.out.println("Enter your account number here: ");
        this.intScanner = in.nextInt();
        accntArray();
    }

    //creates an array of accounts that stores 11 accounts(can be upgraded later) and a FOR loop that searches through the array for the entered account number
    //and returns valid or invalid then continues from there to either enter pin for account or create account if the account was invalid
    //what in this class is'nt finished: ELSE SHOULD REDIRECT YOU TO A NEW (METHOD OR CLASS(UNDECIDED YET)) THAT LETS YOUR CREATE A NEW ACCOUNT AND PIN NUM
    // IF STATEMENT SHOULD CALL A METHOD THAT HOLDS ARRAY VALUES FOR PIN NUMBERS FOR EACH ACCOUNT(STILL DON'T KNOW HOW IM GONNA DO THAT
    public void accntArray(){

        int[] accntNums = new int[]{Account1, Account2, Account3, Account4, Account5, Account6, Account7, Account8, Account9, Account10, Account11};

        for(int n: accntNums){
            if(this.intScanner == n){
                try {
                    sleep();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("We found your account please enter your pin number for account number " + this.intScanner +" :");

                break;
            } else{
                try {
                    sleep();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("The account number you entered doesn't seem to exist ");
                break;
            }
        }
    }

    //creates an array to store account pins MAKE SURE PIN WORKS ONLY FOR SPECIFIED ACCOUNT NOT ALK ACCOUNTS
    public void accntPin(){

    }


    public void sleep() throws InterruptedException {
        Thread.sleep(700);
    }

}
