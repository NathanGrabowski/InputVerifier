/** *************************************************************************
 *
 * FILE:           NJGUtilities.java
 * DATE:           Nov 2, 2021
 * AUTHOR:         Nathan Grabowski
 * VERSION:        1.0
 * PURPOSE:        Boxprint Assignment 5
 *
 ************************************************************************** */
import java.util.Scanner;
public class NJGUtilities {
    public static void squareRootLoop() {
        int num = 1;
        while (num <= 1000) {
            System.out.println(num + "        " + java.lang.Math.sqrt(num));
            num++;
        }
    }
    public static void outputBoxedStr(String message) {
        int messagelength = message.length();//Takes the length of the message
        if (messagelength > 20) {//if the length is bigger than 20...
            message = message.substring(0, 20);//cut the message down 
            messagelength = 20;//sets the message length to twenty
        }
        int dislength = messagelength + 6;//Sets the length of the @ on top
        int spaces = dislength - 4;//Sets the number of spaces in between 
        for (int i = 0; dislength > i; i++) {//Prints a @ to match display
            System.out.print("@");
        }
        System.out.println("");

        System.out.print("@@");
        for (int s = 0; spaces > s; s++) {//Prints the amount of spaces on top
            System.out.print(" ");
        }
        System.out.print("@@");
        System.out.println("");

        System.out.print("@@");
        System.out.print(" " + message + " ");//Prints the message
        System.out.print("@@");
        System.out.println("");

        System.out.print("@@");
        for (int s = 0; spaces > s; s++) {//Prints the amount of spaces on bot
            System.out.print(" ");
        }
        System.out.print("@@");
        System.out.println("");

        for (int i = 0; dislength > i; i++) {//Prints the @s on bottom
            System.out.print("@");
        }
        System.out.println("");
    }
}
