package com.company;

import java.util.Scanner;

public class Menu {

    Scanner menuScan = new Scanner(System.in);
    int menuChoice;

    public Menu(){
        do {
            System.out.println("Choose the corresponding number: \n1- Enter account info\n2- Make a new account\n3- quit the program");
            menuChoice = menuScan.nextInt();
            if(menuChoice == 1){
                Accounts account = new Accounts();
                break;
            } //else if(menuChoice == 2){
                //this will be the option to create an account with an assigned account number but customizable pin number
            //}
        }while(menuChoice != 3);

    }
}
