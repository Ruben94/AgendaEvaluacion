package com.company.model;


import java.util.LinkedList;

public class ContactList {

    private LinkedList<DataContact> contacts = new LinkedList<>();

    public ContactList() {
    }

    public void add(DataContact dataContact){
        this.contacts.add(dataContact);
    }
    public LinkedList<DataContact> getContacts() {
        return contacts;
    }

    public boolean isEmpty(){
        return contacts.size() == 0;
    }

    public void print(){
        if ( contacts.isEmpty()){
            System.out.println("No hay contactos");
            return;
        }
        for (DataContact contact: contacts) {
            System.out.println(contacts.indexOf(contact) + " - " + contact.getName() + " - " + contact.getPhone());
        }
        System.out.println();
    }
}
