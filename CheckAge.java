/*Session 2
* Assignment 1
* Problem Statement :
* Write a Java program to allow the user to input his/her age. Then the program has to show whether the person is eligible to vote or not.
* Expected Output :
* Not applicable.*/

import java.io.IOException;
import java.util.Scanner;

public class CheckAge {
    
    public static void main(String[] args) throws IOException{
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Age: ");
        age = sc.nextInt();
        if(age < 0)
            System.out.print("Invalid age!!!");
        else if(age >= 18){
            System.out.print("Valid age. And you are eligible to vote.");
        }else
            System.out.print("Valid age. But you are not eligible to vote.");
    }
    
}
