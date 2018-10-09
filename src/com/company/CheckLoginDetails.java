package com.company;


import java.util.Map;

public class CheckLoginDetails {

    //Check to see if input from user matches a username and password in the logins array
    public static boolean checkIfValid(String login_usernameInput, String login_password, Map<String, String> logins) {


        for (String username:logins.keySet()
             ) {
            if (login_usernameInput.equals(username)) {
                //This line grabs the value/password linked with the key/username
                if (login_password.equals(logins.get(username))) {
                    System.out.println("Login details accepted!");
                    System.out.println("Welcome " + username);
                    return true;
                } else {
                    System.out.println("The username or password is incorrect");
                }
            }
        }

        return false;


        //Original code since been improved
//        if (login_usernameInput.equals("Jimmy")) {
//            System.out.println("Username Correct");
//        } else {
//            System.out.println("This does not match a username in our database!");
//        }


//        if (login_usernameInput.equals(logins[0][0]))
//        {
//            if (login_password.equals(logins[0][1]))
//            {
//                System.out.println("Login details accepted!");
//                System.out.println("Welcome " + logins[0][0]);
//            }
//            else
//            {
//                System.out.println("The username or password is incorrect");
//            }
//        }
//        else if (login_usernameInput.equals(logins[1][0]))
//        {
//            if (login_password.equals(logins[1][1]))
//            {
//                System.out.println("Login details accepted!");
//                System.out.println("Welcome " + logins[1][0]);
//            }
//            else
//            {
//                System.out.println("The username or password is incorrect");
//            }
//        }
//        else if (login_usernameInput.equals(logins[2][0]))
//        {
//            if (login_password.equals(logins[2][1]))
//            {
//                System.out.println("Login details accepted!");
//                System.out.println("Welcome " + logins[2][0]);
//            }
//            else
//            {
//                System.out.println("The username or password is incorrect");
//            }
//        }
//        else if (login_usernameInput.equals(logins[3][0]))
//        {
//            if (login_password.equals(logins[3][1]))
//            {
//                System.out.println("Login details accepted!");
//                System.out.println("Welcome " + logins[3][0]);
//            }
//            else
//            {
//                System.out.println("The username or password is incorrect");
//            }
//        }
//        else
//        {
//            System.out.println("The username or password is incorrect");
//        }


    }
}
