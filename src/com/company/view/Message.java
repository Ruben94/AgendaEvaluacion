package com.company.view;


public class Message {
    public static void printHelp(){
        String[] help = {
                        "  _  _ ___ _    ___ \n" +
                        " | || | __| |  | _ \\\n" +
                        " | __ | _|| |__|  _/\n" +
                        " |_||_|___|____|_|  \n" +
                        "                    ",
                "(H)ELP \t-> Muestra la ayuda\n",
                "(Q)UIT \t-> Salir de la agenda",
                "(L)IST \t-> Mira la lista de contactos",
                "(A)DD \t-> Añadir un contacto",
                "(D)ELETE \t-> Borra un contacto",

        };
        for (int i = 0; i < help.length; i++) {
            System.out.println(help[i]);
        }
    }
}
