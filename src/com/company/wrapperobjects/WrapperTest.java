package com.company.wrapperobjects;

public class WrapperTest {
    public static void main(String[] args) {
        try{
            String numbers = "d424";
            String afterRegex = numbers.replaceAll("[a-z]", " ");
            int num = Integer.parseInt(numbers);
            int result = num + 30;
            System.out.println(result);
        } catch (Exception e){
            System.out.println("My exception: " + e);
        }


    }
}
