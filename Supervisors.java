package PaymentSystem;

public class Supervisors extends Employees {
	
	double bonusSupervisor;
	
	public Supervisors(String name, double pay,double bonus) {
		super(name, pay); //calling constructor of super class, avoiding redundancy.
		this.bonusSupervisor = bonus;
	}
	
	@Override
	public double biWeeklyPay(int hoursWorked) {
		return super.biWeeklyPay(hoursWorked) + bonusSupervisor;
	}
	
}

