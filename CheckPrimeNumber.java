/*Session 3
* Assignment 2
* Problem Statement :
* Write a simple Java program to check whether a given number is a prime number or not.
* Expected Output :
* Should print whether the given number is a prime number or not	*/

import java.io.IOException;
import java.util.Scanner;

public class CheckPrimeNumber {    
    public static void main(String[] args) {
        PrimeNumber pNum1 = new PrimeNumber();
        if(pNum1.checkPrime())  System.out.println("It is a Prime Number.");
        else   System.out.println("It is not a Prime Number.");
    }
    
}

class PrimeNumber{
    int num;
    public PrimeNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A No...:  ");
        num = sc.nextInt();
    }
    boolean checkPrime(){
        for(int i=1; i<num/2; i++){
            if(num%i == 0 && i!=1){
                return false;
            }                               
        }
        return true;
    }
}
