package com.company.wrapperobjects;

import java.util.Arrays;
import java.util.Scanner;

public class CheckPassFail {
    public static void main(String[] args) {
        Scanner password = new Scanner(System.in);
        String pass = "582932358394203958342274589324578249301239485732433";
        String[] passToArray = pass.split("");
        System.out.println(Arrays.toString(passToArray));
        int elementCount = passToArray.length;
        System.out.println(elementCount);

        if (elementCount <= 50){
            System.out.println("pass");
        } else{
            System.out.println("block");
        }
        System.out.println("done");

    }
}
