package com.company;

import java.util.Scanner;

public class AddNew {

    public static void newClient()
    {
        boolean addNewClient;

        System.out.println("Please enter the full details of the new client! \nThis information must follow a specific pattern. \nName Address Age");
        Scanner scan = new Scanner(System.in);
        String userInput = scan.nextLine();


        addNewClient = true;

        Data.clients().add();





    }
}
