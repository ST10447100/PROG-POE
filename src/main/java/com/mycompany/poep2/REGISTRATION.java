/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poep1;

import java.util.Scanner;

/**
 *
 * @author RC_Student_lab
 */
public class REGISTRATION {

    Scanner scan = new Scanner(System.in);

// This method is ceckingif the username meets the requirements
    public static boolean isUsernameValid(String username) {
        boolean containsUnderscore = username.contains(" _ ");
        boolean maxFiveCharacters = username.length() <= 5;
        return containsUnderscore && maxFiveCharacters;
    }

//A method that tests if the password meets all the requirements
    public static boolean isPasswordValid(String password) {

// Declarations of the needed conditions to check the passwords strength
        boolean containsCapitalLetter = false;
        boolean containsNumber = false;
        boolean containsSpecialCharacter = false;
        boolean containsEightCharacters = password.length() >= 8;

        for (int i = 0; i < password.length(); i++) {
            char cha = password.charAt(i);
            if (Character.isUpperCase(cha)) {
                containsCapitalLetter = true;
            } else if (Character.isDigit(cha)) {
                containsNumber = true;
            } else if (isSpecialCharacter(cha)) {
                containsSpecialCharacter = true;
            }

        }
        return containsEightCharacters && containsCapitalLetter && containsNumber && containsSpecialCharacter;
    }

     private static boolean isSpecialCharacter(char cha) {
        return !Character.isLetterOrDigit(cha);
    }
   
}
