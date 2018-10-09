package com.company;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Main {

    public static Map<String, String> logins = new HashMap<String, String>() {{
        put("Jimmy", "Jimb0257");
        put("Carl", "Carlo56");
        put("Sharon", "Shazza88");
        put("Toby", "T0bler0ne");
    }};



    public static void main(String[] args) throws IOException {
	// write your code here

        String login_usernameInput;
        String login_password;

        //Test to make sure the array is working and can display info
//        int i, j;
//        for (i=0; i < logins.length; i++)
//        {
//
//            for (j = 0; j < 2; j++)
//            {
//                System.out.print(logins[i][j]);
//                System.out.println();
//            }
//
//        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your username, then press Enter!");
        login_usernameInput = scanner.next();
        System.out.print("Please enter your password, then press Enter!");
        login_password = scanner.next();
        //System.out.println(login_usernameInput);
        //System.out.println(login_password);

        if (CheckLoginDetails.checkIfValid(login_usernameInput, login_password, logins)) {

            Menu.displayMenu();
        }

        scanner.next();











    }
}
