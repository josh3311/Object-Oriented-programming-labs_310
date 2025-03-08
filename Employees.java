package PaymentSystem;


/**
This class represents the employee. An employee is paid the same (particular) amount regardless of the hours (additional) the employee worked.
*/

/**

Constructs an employee with a given name and an annual pay.
@param name the name of this employee
@param pay the annual pay of the employee
*/
public class Employees extends Millers{
	// TO DO: TASK 1 - DECLARE YOUR CLASS AND ANY VARIABLES HERE.
	final int numberBiWeeklyPerYear = 52;
	double annualPay;

	
	
		
	public Employees(String name, double pay){
		  setName(name);
		  annualPay = pay;
	}
	 
	@Override
	public double biWeeklyPay(int hoursWorked) {
		return annualPay/numberBiWeeklyPerYear;
	}
		

// TO DO: TASK - This portion of your code computes the pay for this category of miller.

	
}




