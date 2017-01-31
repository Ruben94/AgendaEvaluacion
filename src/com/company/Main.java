package com.company;

import com.company.controller.Play;
import com.company.view.Title;

public class Main {

    public static void main(String[] args) {
        Title.printTitle();
        Play agenda = new Play();
        agenda.play();
    }
}
