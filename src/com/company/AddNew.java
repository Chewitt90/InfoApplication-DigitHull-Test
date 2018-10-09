package com.company;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class AddNew {

    public static void newClient()
    {


        System.out.println("Please enter the full name of the new client!");
        Scanner scan = new Scanner(System.in);
        String newClientName = scan.nextLine();
        System.out.println("Please enter the full address of the new client!");
        String newClientAddress = scan.nextLine();
        System.out.println("Please enter the age of the new client!");
        String newClientAge = scan.nextLine();

        Data.addTooArray(newClientName, newClientAddress, newClientAge);





    }
}
