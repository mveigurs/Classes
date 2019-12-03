package com.company.calculator;

import java.util.Scanner;
import java.util.regex.Pattern;


public class RegexCalculator {
    public static void main(String[]args) {

        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNext("[-+?*]")) {
            scanner.next();
        }

        String value = scanner.next();
        scanner.nextLine();
        System.out.println("Please input number 1: ");
        int num1 = scanner.nextInt();
        System.out.println("Please input number 2: ");
        int num2 = scanner.nextInt();

        System.out.println(value);


    }
}