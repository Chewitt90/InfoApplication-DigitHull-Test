package com.company;
import java.util.Scanner;

public class SearchInfo {

    public static void searchData()
    {

        String finAnswer;
        boolean finished;
        do {

            System.out.println("Please enter the full name of the client you would like to view!");
            Scanner scan = new Scanner(System.in);
            String userInput = scan.nextLine();

            for (Client c : Data.Clients()
            ) {
                if (c.FullName.equals(userInput)) {
                    System.out.println(c.toString());
                    break;
                }
                else {
                    //TODO make sure this only displays once
                    System.out.println("This record is unable to be found!");
                }


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

        //This is where you will go back to the choice screen.

    }
}
