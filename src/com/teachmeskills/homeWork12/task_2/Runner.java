package com.teachmeskills.homeWork12.task_2;

/**
 * Task *:
 * The program receives arbitrary text as input. This text may contain a number
 * document (one or more), email and phone number. Document number in format:
 * xxxx-xxxx-xx, where x is any number; phone number in the format: +(xx)xxxxxxx. Document
 * may not contain all the information, i.e. for example, may not contain a number
 * phone, or something else. You need to find this information and output it to the console in
 * format:
 * email: teachmeskills@gmail.com
 * document number: 1423-1512-51
 * etc
 */

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Runner {

    public static String TELEPHONE_REGEX = "(\\+\\([0-9]{2}\\)[0-9]{7})";
    public static String DOCUMENT_REGEX = "[0-9]{4}[-]{1}[0-9]{4}[-]{1}[0-9]{2}";
    public static String EMAIL_REGEX = "\\b[0-9A-Za-z.-_]+@[0-9A-Za-z]+\\.[A-Za-z]{2}\\b";

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please write some information");
        String str = scanner.nextLine();

        Pattern telephonePattern = Pattern.compile(TELEPHONE_REGEX);
        Matcher telephoneMatcher = telephonePattern.matcher(str);
        Pattern documentPattern = Pattern.compile(DOCUMENT_REGEX);
        Matcher documentMatcher = documentPattern.matcher(str);
        Pattern emailPattern = Pattern.compile(EMAIL_REGEX);
        Matcher emailMatcher = emailPattern.matcher(str);

        if (telephoneMatcher.find()){
            System.out.println("Telephone number: " + telephoneMatcher.group() + "\n");
        } else {
            System.out.println("Telephone number not found");
        }
        if (documentMatcher.find()){
            System.out.println("Document number: " + documentMatcher.group() + "\n");
        } else {
            System.out.println("Document number not found");
        }
        if (emailMatcher.find()){
            System.out.println("Email address: " + emailMatcher.group() + "\n");
        } else {
            System.out.println("Email address not found");
        }
    }

}
