/*Assignment 4
* Problem Statement :
* Assume that the integer variable x is 5 and the integer variable y is 10.
* Give the values of the following expressions:
  a. x + y * 2 
  b. x - y + 2 
  c. (x+y) * 2 
  d. y % x
* Expected Output :
* The resultant values of the operators applied for each scenario.*/

public class WorkingOnExpression {
    
    public static void main(String[] args) {
        int x=5,y=10;
        int result;				// Here all the expression result values are int

        result = x + y * 2;
        System.out.println("Result of the expression a is "+result);
        result = x - y + 2;
        System.out.println("Result of the expression b is "+result);
        result = (x+y) * 2;
        System.out.println("Result of the expression c is "+result);
        result = y % x;
        System.out.println("Result of the expression d is "+result);
    }
    
}
