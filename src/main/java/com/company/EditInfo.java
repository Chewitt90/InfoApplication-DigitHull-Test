package com.company;

import java.util.Scanner;

public class EditInfo {

    public static void editData()
    {



        System.out.println("Please enter the full name of the client you would like to edit!");
        Scanner scan = new Scanner(System.in);
        String userInput = scan.nextLine();

        for (Client client : Data.getInstance().getClients())
         {
            if (client.getFullName().equals(userInput)) {
                System.out.println(client.toString());

                System.out.println("Please enter new data below. \n Following the same pattern shown in the previous data above. \n Please duplicate any data that is not being changed.");
                String editedData = scan.nextLine();

                //TODO work out how to replace item in List with the string stored in editedData
                //Data.clients().replaceAll();

                break;
            }
        }

//        System.out.println("Please enter new data below. \n Following the same pattern shown in the previous data above. \n Please duplicate any data that is not being changed.");
//        String editedData = scan.nextLine();
//
//        Data.clients().replaceAll();

    }
}
