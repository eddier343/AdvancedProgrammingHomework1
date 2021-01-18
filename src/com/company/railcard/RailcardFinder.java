package com.company.railcard;

import java.util.Scanner;

public class RailcardFinder {


    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a your name: ");
        String userName = scanner.nextLine();

        System.out.print("Enter a your age: ");
        Integer age = scanner.nextInt();

        System.out.println("Hello " + userName);

        if (age >= 5 && age <= 15) {
            System.out.println("You are eligible for a child's railcard");
        }
        if (age >= 16 && age <= 25) {
            System.out.println("You are eligible for a 16-25 Railcard");
        }
        if (age >= 26 && age <= 30) {
            System.out.println("You are eligible for a 26-30 railcard");
        }
        if (age >= 60) {
            System.out.println("You are eligible for a Senior Railcard");
        }

    }
}
