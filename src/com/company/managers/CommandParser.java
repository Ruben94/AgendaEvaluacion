package com.company.managers;


import com.company.model.Command;

public class CommandParser {

    public static Command parse(String text) {


        if ((text.equalsIgnoreCase("help")) || (text.equalsIgnoreCase("h"))) {
            return Command.HELP;
        }
        if ((text.equalsIgnoreCase("quit")) || (text.equalsIgnoreCase("q"))) {
            return Command.QUIT;
        }
        if ((text.equalsIgnoreCase("list")) || (text.equalsIgnoreCase("l"))) {
            return Command.LIST;
        }
        if ((text.equalsIgnoreCase("add")) || (text.equalsIgnoreCase("a"))) {
            return Command.ADD;
        }
        if ((text.equalsIgnoreCase("delete")) || (text.equalsIgnoreCase("d"))) {
            return Command.DELETE;
        }

        return Command.UNKNOWN;

    }
}
