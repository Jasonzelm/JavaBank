package com.company;

import java.util.Scanner;

public class Menu {
    createAccount newAccount;
    public Menu(){
        //boolean variable automatically set to false that will keep the while loop running until set to true
        boolean quit = false;
        //variable to store entered choice through a scanner
        int scanned ;
        //Scanner variable in
        Scanner in = new Scanner(System.in);
        printMenu();

        while(!quit) {
            System.out.println("Enter your choice: ");
            scanned = in.nextInt();

            switch (scanned) {
                case 0:
                    printMenu();
                    break;
                case 1:

                    break;
                case 2:
                    newAccount.optionChosen();
                    break;
                case 3:
                    System.out.println("GoodBye");
                    quit = true;
                    break;
            }
        }
    }

    public static void printMenu(){
        System.out.print("Menu:\n");
        System.out.print("\t0 - To print the menu\n");
        System.out.print("\t1 - To Access an existing account\n");
        System.out.print("\t2 - To create a new account\n");
        System.out.print("\t3 - To quit the program\n");
    }
}
