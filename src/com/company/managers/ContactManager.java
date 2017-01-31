package com.company.managers;


import com.company.model.ContactList;
import com.company.model.DataContact;

import java.util.Scanner;

public class ContactManager {

    public static void add(ContactList contactList) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nombre: ");
        String name = scanner.nextLine();

        System.out.print("Telefono: ");
        String phone = scanner.nextLine();

        if (name.equals("") || phone.equals("")){
            System.out.println("Faltan datos");
        } else {
            DataContact newContact = new DataContact();
            newContact.setName(name);
            newContact.setPhone(phone);
            contactList.add(newContact);
            System.out.println("Contacto añadido...");
        }
    }

    public static void delete(ContactList contactList) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Posicion para borrar: ");
        String index = scanner.nextLine();
        try {
            contactList.getContacts().remove(Integer.parseInt(index));
            System.out.println("Contacto borrado");
        }catch (Exception e){
            System.out.println("Error al introducir posicion");
        }
    }

    public static void list(ContactList contactList) {
        System.out.println("lista");
    }
}
