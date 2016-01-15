/*Session 1
* Assignment 1
* Problem Statement :
* Write a program to print the sum of two numbers. One number should be int and another should be float.
* Expected Output :
* The sum of two numbers should be in integer.
*/

public class SumOfTwoNumber {
    
    public static void main(String[] args) {
        int no1=5,sum;
        float no2=(float) 5.3;      // Type Casting to float value
        sum = (int) (no1 + no2);     // Type Casting to int value
        
        System.out.println("The Sum of "+no1+"(int) + "+no2+"(float) is "+sum+"(int).");
    }
    
}
