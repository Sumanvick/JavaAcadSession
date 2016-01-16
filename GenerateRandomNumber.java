/*Session 3
* Assignment 3
* Problem Statement :
* Write a java program which generates a random number such that 0 <= Random Number <= N-1 * where N is a given input number.
* Expected Output :
* Should print the random generated numbers based on given inputs.	*/

import java.io.IOException;
import java.util.Scanner;

public class GenerateRandomNumber{
 
    public static void main(String args[]) throws IOException{
        RandomNumber rndmNum = new RandomNumber();
        System.out.println("The Random No is "+rndmNum.generateRandomNumber());
 
    }
}

class RandomNumber{
    int ubNum;
    public RandomNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A No...:  ");
        ubNum = sc.nextInt();
    }
    int generateRandomNumber(){
        return (int)(ubNum * Math.random());
    }
}
