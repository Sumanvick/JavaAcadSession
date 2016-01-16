/*Session 3
* Assignment 1
* Problem Statement :
* To calculate square root and cube root of a number in Java. Use Math class and its static method sqrt(...) & cbrt(...).
* Expected Output :
* Should print the square root and cube root of a given number.	*/

import java.io.IOException;
import java.util.Scanner;

public class GetRoot {    
    public static void main(String[] args)  throws IOException{
        Number num1 = new Number();
        System.out.println("The Sqrt Of The Given Number Is "+num1.getSqrt());
        System.out.println("And The Cbrt Of The Given Number Is "+num1.getCbrt());
    }
    
}

class Number{
    double num;
    public Number(){		// Initializing Variable Using Constructor..
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A No...:  ");
        num = sc.nextDouble();
    }
    double getSqrt(){
       return Math.sqrt(num);
    }
    double getCbrt(){
       return Math.cbrt(num);
    }
}
