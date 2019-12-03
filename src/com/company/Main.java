package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
	    String stringInp = "RegExr was created by gskinner.com, and is proudly hosted by Media Temple.";

	    String regexStr = "ou";

	    Pattern pattern = Pattern.compile(regexStr);

        Matcher matcher = pattern.matcher(stringInp);

        System.out.println(matcher);

        while(matcher.find()){
            System.out.println("find int string: " + matcher.group()
            + " starting at index " + matcher.start()
            + " ending " + matcher.end());

        }
    }
}
