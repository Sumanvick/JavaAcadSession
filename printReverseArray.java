/*Session 4
* Assignment 1
* Problem Statement :
* Print reverse of an array.
* Expected Output :
* Should print the reverse of an Array.	*/

import java.util.Arrays;

public class printReverseArray {
   public static void main(String args[])throws Exception{
        int array[] = { 100, 104, 105, 106, 101, 102, 103, 107, 108, 109 };
	System.out.println("The Array Is...");
        printArray(array);
        System.out.println("\n--------------------------------------------");
		
	System.out.println("The Reverse Array Is...");
        printReverseArray(array);
   }
   private static void printArray(int[] array){
        for (int i = 0; i < array.length ; i++) {
            System.out.print(array[i]+" ");                     
        }
        System.out.println();
   }
    
   private static void printReverseArray(int[] array){
        for (int i = array.length-1; i >=0 ; i--) {
            System.out.print(array[i]+" ");                     
        }
        System.out.println();
   }
}
