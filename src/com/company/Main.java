package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int c = 0; // hold user choice
        String bizName, name, phone;
        Scanner sc = new Scanner(System.in);

        System.out.println("Are you a:");
        System.out.println("1. Residential Customer");
        System.out.println("2. Business Customer");
        c = sc.nextInt();

        switch (c)
        {
            case 1:
                System.out.println("Please enter your name: ");
                name = readString();
                System.out.println("Please enter your contact phone number: ");
                phone = readString();
                displayInfo(name, phone);
                break;

            case 2:
                System.out.println("Please enter the name of your business: ");
                bizName = readString();
                System.out.println("Please enter your name: ");
                name = readString();
                System.out.println("Please enter your contact phone number: ");
                phone = readString();
                displayInfo(bizName, name, phone);
                break;

            default:
                System.out.println("You are incompetent.");
        }
    }

    // takes user string input and passes it to variables
    private static String readString()
    {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    // displays information about residential customers
    private static void displayInfo(String n, String p)
    {
        System.out.println("Residential Customer");
        System.out.println("Customer Name: " + n);
        System.out.println("Customer Phone: " + p);
    }

    // displays information about business customers
    private static void displayInfo(String b, String n, String p)
    {
        System.out.println("Business Customer");
        System.out.println("Business Name: " + b);
        System.out.println("Contact Name: " + n);
        System.out.println("Business Phone: " + p);
    }
}
