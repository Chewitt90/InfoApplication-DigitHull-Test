package com.company;

import java.util.Scanner;

public class GatherClientInformationFromUser {

    public static void newClient() {
        System.out.println("Please enter the full name of the new client");
        Scanner scan = new Scanner(System.in);
        String fullName = scan.nextLine();
        System.out.println("Please enter the full address of the new client");
        String fullAddress = scan.nextLine();
        System.out.println("Please enter the age of the new client");
        int age = scan.nextInt();


        Client newClient = new Client(fullName, fullAddress, age);

        Data.getInstance().addClient(newClient);

    }
}
