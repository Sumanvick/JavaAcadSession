/*Session 4
* Assignment 4
* Problem Statement :
* Print reverse of a given String value.
* Expected Output :
* Should print the reverse of a given String value.	*/

import java.io.IOException;
import java.util.Scanner;

public class StringReverse{
 
    public static void main(String args[]) throws IOException{
        StringOperation string= new StringOperation();
        String reverseString ;
        reverseString = string.reverseString();   
        System.out.println("Before Reverse The String Is .....\n"+string.str);
        System.out.println("--------------------------------------------");
        System.out.println("After Reverse The String Is .....\n"+reverseString);
 
    }
}

class StringOperation{
    String str;
    public StringOperation(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A String...:  ");
        str = sc.nextLine();
    }
    String reverseString(){
        String tempStr = str;
        tempStr = new StringBuffer(str).reverse().toString();        
        return tempStr;        
    }
}
