/*Session 3
* Assignment 4
* Problem Statement :
* Design a very basic calculator having features like add, subtract, multiply and division.
* Expected Output :
* Should take inputs of value and operation (+, -,/,*) to be performed from the user. Should print resultant calculated value.	*/

import java.io.IOException;
import java.util.Scanner;

public class BuildCalculator{
 
    public static void main(String args[]) throws IOException{
       Calculator calOperation = new Calculator();
       String operator;
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter A Operator( + , - , * , / )...:  ");
       operator = sc.next();
	   
       switch(operator){
       
           case "+" : System.out.println("The result of ( "+calOperation.num1+" + "+calOperation.num2+" ) is "+calOperation.addition());
                      break;
           
           case "-" : System.out.println("The result of ( "+calOperation.num1+" - "+calOperation.num2+" ) is "+calOperation.subtraction());
                      break;
               
           case "*" : System.out.println("The result of ( "+calOperation.num1+" * "+calOperation.num2+" ) is "+calOperation.multiplication());
                      break;
               
           case "/" : System.out.println("The result of ( "+calOperation.num1+" / "+calOperation.num2+" ) is "+calOperation.division());
                      break;
               
           default :  System.out.println("Please, Choose A Valid Option...");
		   
       }
 
    }
}

class Calculator{
    int num1,num2;
    public Calculator(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st No...:  ");
        num1 = sc.nextInt();
        System.out.print("Enter 2nd No...:  ");
        num2 = sc.nextInt();
    }
    int addition(){
        return num1 + num2;
    }
    int subtraction(){
        return num1 - num2;
    }
    int multiplication(){
        return num1 * num2;
    }
    double division(){
        return num1 / num2;
    }
}
