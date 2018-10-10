package com.company;
import java.util.Scanner;

public class SearchInfo {

    public static void searchData() {
        String finAnswer;
        boolean finished;
        do {

            System.out.println("Please enter the full name of the client you would like to view!");
            Scanner scan = new Scanner(System.in);
            String userInput = scan.nextLine();

            for (Client client : Data.getInstance().getClients()) {
                if (client.getFullName().equals(userInput)) {
                    System.out.println("This record matches the search query.");
                    System.out.println(client.toString());
                    break;
                }

                    System.out.println("This record does not match with the search query!");

            }


            System.out.println("Have you finished viewing clients? Y/N");
            finAnswer = scan.next();
            if (finAnswer.equals("N"))
            {
                finished = false;

            }
            else {
                finished = true;
            }


        } while (finished != true);

        Menu.displayMenu();
        //This is where you will go back to the choice screen.

    }
}
