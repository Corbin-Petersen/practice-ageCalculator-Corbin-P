package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What is your age?: ");
        int userAge = input.nextInt();

        int yearsLeft = 100 - userAge;

        System.out.println("You have " + yearsLeft + " years left until you turn 100!");

        input.close();
    }
}
