package com.company.view;

import com.company.model.ContactList;

import java.util.Scanner;


public class Prompt {
    public static void print(ContactList contactList){
        System.out.print("(" + contactList.getContacts().size() + ") > ");
    }

    public static String read() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
