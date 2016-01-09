/*Assignment 3
* Problem Statement :
* Give two examples of data that cannot be stored in a variable of type int.
* Expected Output :
* Not applicable.*/

public class VariableIntialization {
    
    public static void main(String[] args) {
        int age="Suman";	// This intialization is not possible here ()"Suman") is a string and int variable (age) accepts  numeric value.
		
	int age=true;	// This intialization also is not possible here (true) is a boolean and int variable (age) accepts  numeric value.
    }
    
}
