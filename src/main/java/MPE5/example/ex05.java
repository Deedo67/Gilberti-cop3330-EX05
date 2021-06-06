package MPE5.example;

import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Derek Gilberti
 */

//class begin
public class ex05 {
    //main method begin
    public static void main(String[] args) {
        //scanner
        Scanner in = new Scanner(System.in);

        //inputs
        System.out.print("What is the first number? ");
        String firstString = in.nextLine();
        System.out.print("What is the second number? ");
        String secondString = in.nextLine();

        //String convert
        int firstInt =Integer.parseInt(firstString);
        int secondInt =Integer.parseInt(secondString);

        //math
        int add = firstInt + secondInt;
        int sub = firstInt - secondInt;
        int mult = firstInt * secondInt;
        int div = firstInt / secondInt;

        //Output String
        String outputString = firstInt + " + " + secondInt + " = " + add + "\n" + firstInt + " - " + secondInt + " = " + sub + "\n" + firstInt + " * " + secondInt + " = " + mult + "\n" + firstInt + " / " + secondInt + " = " + div +"\n";

        //Output
        System.out.println(outputString);
    }
    //main method end
}
//class end
