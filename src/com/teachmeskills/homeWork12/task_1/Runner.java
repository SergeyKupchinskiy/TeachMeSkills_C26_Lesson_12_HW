package com.teachmeskills.homeWork12.task_1;

/**
 * Task 1:
 * Output to the console from the line that the user enters from the keyboard everything
 * abbreviations. An abbreviation is a word of 2 to 6 characters, consisting
 * only capital letters, no numbers.
 */

import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Write a random text: ");
        String str = scanner.nextLine();

        String[] abbreviations = str.split("\\s+");

        for (int i = 0; i < abbreviations.length; i++) {
            if(abbreviations[i].matches("[A-Z]{2,6}")){
                System.out.println(abbreviations[i]);
            }

        }
    }
}
