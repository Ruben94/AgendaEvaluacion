package com.company.controller;

import com.company.managers.CommandParser;
import com.company.managers.ContactManager;
import com.company.model.Command;
import com.company.model.ContactList;
import com.company.model.DataContact;
import com.company.util.FileManager;
import com.company.view.Message;
import com.company.view.Prompt;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class Play {
    ContactList contactList = new ContactList();
    FileManager fileManager = new FileManager();
    List<String> names = new ArrayList<>();
    List<String> phones = new ArrayList<>();

    public void play() {
        boolean end = false;
        loadData();
        while (!end) {
            Prompt.print(contactList);
            String command = Prompt.read();
            Command com = CommandParser.parse(command);

            switch (com) {
                case HELP:
                    Message.printHelp();
                    break;
                case QUIT:
                    //se crean los archivos de datos
                    List<String> contactNames = new ArrayList<>();
                    List<String> contactPhones = new ArrayList<>();
                    LinkedList<DataContact> contactsToSave = contactList.getContacts();

                    for (DataContact contact : contactsToSave) {
                        contactNames.add(contact.getName());
                        contactPhones.add(contact.getPhone());
                    }
                    saveData(contactNames, "names.txt");
                    saveData(contactPhones, "phones.txt");
                    end = true;

                    end = true;
                    break;
                case LIST:
                    contactList.print();
                    break;
                case ADD:
                    ContactManager.add(contactList);
                    break;
                case DELETE:
                    ContactManager.delete(contactList);
                    break;
                case UNKNOWN:
                    System.out.println("Comando erroneo.");
                    break;
            }
        }
    }

    public void saveData(List<String> contactInfo, String fileName) {
        try {
            fileManager.createFile(fileName, contactInfo);
        } catch (IOException e) {
            System.out.println("Error grabando...");
            e.printStackTrace();
        }
    }

    private void loadData() {
        try{
            names = fileManager.readFile("names.txt");
            phones = fileManager.readFile("phones.txt");

            for (int i = 0; i < names.size(); i++) {
                DataContact contactToRead = new DataContact();
                contactToRead.setName(names.get(i));
                contactToRead.setPhone(phones.get(i));
                contactList.add(contactToRead);
            }
        }catch (NullPointerException e){
            System.out.println("Creando archivos...");
        }
    }
}