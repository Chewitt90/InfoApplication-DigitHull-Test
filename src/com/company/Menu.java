package com.company;

import java.util.Scanner;

public class Menu {


            public static void displayMenu()
            {

                System.out.println("Please choose from the options below! \n 1. Search Clients \n 2. Edit Existing Client Record \n 3. Add New Client Record");
                Scanner scan = new Scanner(System.in);
                String userInput = scan.nextLine();

                switch (userInput)
                {
                    case "1":
                        SearchInfo.searchData();
                        break;

                    case "2":
                        EditInfo.editData();
                        break;

                    case "3":
                        AddNew.newClient();
                        break;
                }

            }
}
