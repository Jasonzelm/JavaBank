package com.company;

import java.util.ArrayList;

public class arrayList {
    public static ArrayList<createAccount> account = new ArrayList<createAccount>();
    createAccount newAccount;

    public static void addAccountList(createAccount newAccount){
        if(account.contains(newAccount)){
            System.out.println("The account you made matches one already on file, please try again");
        } else {
            account.add(newAccount);
            System.out.println("Your account was created successfully");
        }
    }

    public static boolean contains(createAccount obj){
        return account.contains(obj);
    }

    public static void printArray(){
        for(int i=0; i<=account.size(); i++){
            System.out.println(i+1 + ". - " + account.get(i));
        }
    }
}
