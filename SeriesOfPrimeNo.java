/*Session 2
* Assignment 2
* Problem Statement :
* Generate prime numbers between 1 and 100 using for loop. A prime number (or a prime) is a natural number greater than 1
* that has no positive divisors other than 1 and itself. A natural number greater than 1 that is not a prime number is called
* a composite number. Use for loop and break statement to achieve this task.
* Expected Output :
* Prime numbers between 1 and 100 1 2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97	*/

public class SeriesOfPrimeNo {
    
    public static void main(String[] args) {
        int i,j;
		System.out.println("The prime numbers between 1 and 100 are..."); 
        for(i=1; i<100; i++){
            for(j=1; j<i/2+1; j++){
                if(i%j == 0 && j!=1)
                    break;               
            }
            if(j==i/2+1) System.out.print(i+",");                       
        }
    }
    
}
