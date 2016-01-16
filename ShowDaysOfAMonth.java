/*Session 2
* Assignment 4
* Problem Statement :
* Write a program to print total number of days in the given month.
* Expected Output :
* Should print total number of days in the given month.	*/

import java.io.IOException;
import java.util.Scanner;

public class ShowDaysOfAMonth {
    
    public static void main(String[] args) throws IOException{
        String month;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A Month: ");
        month= sc.next();
        month = month.toLowerCase();
        switch(month){
            case "january" : 
            case "jan" :   System.out.print("The No Of Days In This Month : 31 Days");
                           break;
            case "february" : 
            case "feb" :   System.out.print("The No Of Days In This Month : 28 days, 29 days in Leap Years");
                           break;
            case "march" : 
            case "mar" :   System.out.print("The No Of Days In This Month : 31 Days");
                           break;
            case "april" : 
            case "apr" :   System.out.print("The No Of Days In This Month : 30 Days");
                           break; 
            case "may" :   System.out.print("The No Of Days In This Month : 31 Days");
                           break;
            case "june" : 
            case "jun" :   System.out.print("The No Of Days In This Month : 30 Days");
                           break;
            case "july" : 
            case "jul" :   System.out.print("The No Of Days In This Month : 31 Days");
                           break;
            case "august" : 
            case "aug" :   System.out.print("The No Of Days In This Month : 31 Days");
                           break;
            case "september" : 
            case "sep" :
            case "sept" :   System.out.print("The No Of Days In This Month : 30 Days");
                            break;
            case "october" :
            case "oct" :   System.out.print("The No Of Days In This Month : 31 Days");
                           break;
            case "november" :
            case "nov" :   System.out.print("The No Of Days In This Month : 30 Days");
                           break;
            case "december" :
            case "dec" :   System.out.print("The No Of Days In This Month : 31 Days");
                           break;
            default :      System.out.print("Please Enter A Valid Month.....");
        }
    }
    
}
