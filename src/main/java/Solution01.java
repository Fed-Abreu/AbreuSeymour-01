import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Federico Abreu Seymour
 */
public class Solution01 {
    /*
       add scanner
        print "What is your name?"
           scan String name = read input
           print "Hello, " + name "nice to meet you!"
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("What is your name? ");
        String name = input.nextLine();
        System.out.print("Hello, " + name + ", nice to meet you!");


    }





}
