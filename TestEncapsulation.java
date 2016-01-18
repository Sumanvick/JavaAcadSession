/*Session 4
* Assignment 3
* Problem Statement :
* Create a encapsulation class for employee details.
* Expected Output :
* Not Applicable	*/

public class TestEncapsulation{
    public static void main(String args[]){
        Employee emp1 = new Employee();
        emp1.setEmpID(458978);
        emp1.setEmpName("Suman Sarkar");
        emp1.setEmpAge(23);
		
        System.out.println("Employee ID: " + emp1.getEmpID());
        System.out.println("Employee Name: " + emp1.getEmpName());        
        System.out.println("Employee Age: " + emp1.getEmpAge());
    } 
}

class Employee{
    private int empID,empAge;
    private String empName;

    //Access Data Member By Member Functions
	
    public int getEmpID(){
        return empID;
    }
    public String getEmpName(){
        return empName;
    }
    public int getEmpAge(){
        return empAge;
    }
	public void setEmpID(int newValue){
        empID = newValue;
    }
    public void setEmpAge(int newValue){
        empAge = newValue;
    }
    public void setEmpName(String newValue){
        empName = newValue;
    }    
}
