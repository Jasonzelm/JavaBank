package com.company;

import java.util.Scanner;

public class Menu {
    arrayList array;
    createAccount newAccount;
    public Menu(){

        boolean quit = false;

        int scanned ;

        Scanner in = new Scanner(System.in);
        printMenu();

        while(!quit) {
            System.out.println("Enter your choice: (0 to print the menu) ");
            scanned = in.nextInt();

            switch (scanned) {
                case 0:
                    printMenu();
                    break;
                case 1:

                    break;
                case 2:
                    //access existing account
                case 3:
                    newAccount.optionChosen();
                    break;
                case 4:
                    //search for an accounts existence
                    break;
                case 5:
                    System.out.println("GoodBye");
                    quit = true;
                    break;
            }
        }
    }

    public static void printMenu(){
        System.out.print("Menu:\n");
        System.out.print("\t0 - To print the menu\n");
        System.out.print("\t1 - To print account names\n");
        System.out.print("\t2 - To Access an existing account\n");
        System.out.print("\t3 - To create a new account\n");
        System.out.print("\t4 - To search for an account\n" );
        System.out.print("\t5 - To quit the program\n");
    }
}
