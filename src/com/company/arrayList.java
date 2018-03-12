package com.company;


import java.util.ArrayList;

public class arrayList {
    public static ArrayList<createAccount> account = new ArrayList<createAccount>();

    public static void addAccount(String name, String pin){

    }

    public static boolean findAccount(createAccount findAccount){
        int position = account.indexOf(findAccount);
        if(position >=0){
          return true;
        }
        return false;
    }

   // public static void printAccount

}
