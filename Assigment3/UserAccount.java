package Assigment2;

import java.util.Scanner;

public class UserAccount {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String sname, fname, born, title, isbn, publisher;
        System.out.print("Please enter author's surname:");

        sname = scan.nextLine();
        System.out.print("Please the initial of author's first name:");
        fname = scan.nextLine();
        System.out.print("Please enter the year the author was born:");
        born = scan.nextLine();
        System.out.print("Please enter the author's book title:");
        title = scan.nextLine();
        System.out.print("Please enter the book's ISBN:");
        isbn = scan.nextLine();
        System.out.print("Please enter the publisher of the book:");
        publisher = scan.nextLine();

        System.out.println("Author's detail");
        System.out.println("**********************");
        System.out.println("Name:" + fname + sname);
        System.out.println("YOB:" + born);
        System.out.println("Age" + born);
        System.out.println("Book Details");
        System.out.println("**********************");
        System.out.println("Title:" + "*" + title + "*");
        System.out.println("ISBN:" + "*" + isbn + "*");
        System.out.println("Publisher:" + "*" + publisher + "*");
    }
}
