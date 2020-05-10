package Assigment2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Arrays;

public class MyApplication {
    private LinkedList<User> userLinkedList;
    // users - a list of users
    private Scanner sc = new Scanner(System.in);
    private User signedUser;

    private void addUser(User user) {
        userLinkedList.add(user);
    }


    private void menu() {
        while (true) {
            if (signedUser == null) {
                System.out.println("You are not signed in.");
                System.out.println("1. Authentication");
                System.out.println("2. Exit");
                int choice = sc.nextInt();
                if (choice == 1) authentication();
                else break;
            } else {
                userProfile();
            }
        }
    }

    private void userProfile() {
        signedUser = null;
        System.out.println("Username: " + signedUser.getUsername() + " Surname: " + signedUser.getSurname() + " Name: " + signedUser.getName());
    }

    private void logOff() {

    }

    private void authentication() {
        // sign in
        // sign up
        int choice = sc.nextInt();
        if (choice == 1) {
            signIn();
        } else {
            signUp();
        }
    }

    private void signIn() {
        Scanner input1 = new Scanner(System.in);
        System.out.println("Enter Username : ");
        String username = input1.next();

        Scanner input2 = new Scanner(System.in);
        System.out.println("Enter Password : ");
        String password = input2.next();

        if (username.equals(username) && password.equals(password)) {

            System.out.println("Access Granted! Welcome!");
        }

        else if (username.equals(username)) {
            System.out.println("Invalid Password!");
        } else if (password.equals(password)) {
            System.out.println("Invalid Username!");
        } else {
            System.out.println("Invalid Username & Password!");
        }
    }

    private void signUp() {
        ArrayList<userType> users = new ArrayList<userType>(); // store and hold user input temporary
        Scanner input = new Scanner(System.in); // to obtain input from user

        String  password, username,name,surname;
        int contact;

        System.out.println("========== SIGN UP PAGE ==========");
        System.out.println("Pick your choice:  ");
        System.out.println("1) User" + "\n" + "2) Tutor");
        int choice = input.nextInt();

        switch(choice) {
            case 1:
                System.out.println("========== User Account ==========");
                //arrays goes here
                break;

            case 2:
                System.out.println("========== Tutor Account ==========");
                //arrays goes here
                break;

            default:
                System.out.println("Please pick your account type");
        }
    }
    }

    public void start() throws FileNotFoundException {
        File file = new File("D:\\Practice1\\src\\Assigment2\\db.txt");
        Scanner fileScanner = new Scanner(file);
        // fill userlist from db.txt

        while (true) {
            System.out.println("Welcome to my application!");
            System.out.println("Select command:");
            System.out.println("1. Menu");
            System.out.println("2. Exit");
            int choice = sc.nextInt();
            if (choice == 1) {
                menu();
            } else {
                break;
            }
        }

        // save the userlist to db.txt
    }

    private void saveUserList() {
        for (int i = 0; i < userLinkedList.size(); i++) {
            User now = userLinkedList.get(i);
            String nowstr = now.toString();
        }
    }


}
