package PaymentSystem;



/**
This code in this file is for the Consultant Class. A Consultant is a miller who is paid for every hour worked.
*/
//declare consultant class 
public class Consultants extends Millers{
// declare consultant variables
	private double consultantWage;

	/**
	   TO DO: TASK 2 - This portion of your code constructs an hourly paid consultant with a given name and biweekly wage.
	   @param name the name of this consultant
	   @param wage the consultant wage per hour 

	*/
	public void consultantsDetails(String name, double consultantWage) {
		setName("John Winslow");
		this.consultantWage = consultantWage	;
	
	}

	// YOUR CODE FOR YOUR CONSULTANT GOES HERE!!
	// TO DO: TASK 3 - THIS PORTION OF YOUR CODE COMPUTES THE 
	@Override
	public double biWeeklyPay(int hoursWorked){
	   double pay = hoursWorked * consultantWage;
	
	    if(hoursWorked > 76) {
		      pay = pay + ((hoursWorked - 76) * 0.5) * consultantWage;
	    }
			   
		 return pay;
	}
}








