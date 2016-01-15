/*Session 2
* Assignment 3
* Problem Statement :
* Write a code using loops to print following pattern.
	1 
	12 
	123 
	1234 
	12345 
	1234 
	123 
	12 
	1
* Expected Output :
* Not applicable.*/

public class PatternPrint {
    
    public static void main(String[] args) {
        for(int i=1; i<=5;i++){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
        for(int i=5; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    
}
