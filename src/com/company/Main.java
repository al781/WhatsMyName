package com.company;
import java.io.*;
import java.util.*;
public class Main
    {

        public static void main(String[] args)
            {
	            Scanner strScan = new Scanner(System.in);
	            String fName;
	            String lName;
                System.out.println("Enter first name.");
                fName = strScan.nextLine();
                System.out.println("Enter last name.");
                lName = strScan.nextLine();
                System.out.println("Your name is " + fName + " " +lName + ".");

            }
    }