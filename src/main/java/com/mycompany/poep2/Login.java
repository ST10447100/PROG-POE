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
public class Login { 
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Enter your username: ");
    String username = scan.nextLine();
    
    System.out.println("Enter your name: ");
    String name = scan.nextLine();
    
    System.out.println("Enter your password: ");
    String password = scan.nextLine();
    
    if (REGISTRATION.isUsernameValid(username)) {
        System.out.println("Username is valid.");
    }else{
    System.out.println("Username is not valid. It must contain an underscore and not exeed five characters.");
    }
    
    if (REGISTRATION.isPasswordValid(password)) {
        System.out.println("Account created successfully!");
    }else{
    System.out.println("Password is not corretly formatted. It must contain at least 9 characters, a capital letter, a number, and a special charecter.");
    }
    scan.close();
    }
}

