/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Input {
     private Input(){};
    static Scanner scanner = new Scanner(System.in);
    private static final String error_message = "Wrong Input ! Please Re-enter ";
    private static final String regex_not_match = "Input Not Valid ! Please Re-enter ";

    public static String inputString(String mess) {
        String str;
        while (true) {
            System.out.println("Enter " + mess + ":");
            try {
                str = scanner.nextLine().trim();
            } catch (NoSuchElementException e) {
                System.out.println(error_message);
                continue;
            }
            if (str.isEmpty()) {
                System.out.println("Please enter a value.");
                continue;
            }
            return str;
        }
    }

    static public String inputString(String mess, String regex) {
        String str;
        while (true) {
            System.out.println("Enter " + mess + ":");
            try {
                str = scanner.nextLine().trim();
            } catch (NoSuchElementException e) {
                System.out.println(error_message);
                continue;
            }
            if (str.isEmpty()) {
                System.out.println("Please enter a value.");
                continue;
            }
            boolean isTrue = DataValidator.checkRegex(str, regex);
            if (isTrue) {
                return str;
            } else {
                System.out.println("Input does not match the required pattern.");
            }
        }
    }
}
