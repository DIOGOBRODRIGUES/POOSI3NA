package app;

public class SalariedEmployee extends Employee{
	private double weeklySalary;
	
	public SalariedEmployee(String first, String last, String ssn, double salary) {
		super(first, last, ssn);
		this.setWeeklySalary(salary);
	}
	
	@Override
	public double getPaymentAmount() {
		return this.weeklySalary;
	}
	
	public double getWeeklySalary() {
		return this.weeklySalary;
	}
	
	public void setWeeklySalary(double salary) {
		/*if(salary < 0)
			this.weeklySalary = 0;
		else
			this.weeklySalary = salary;*/
		this.weeklySalary = (salary < 0.0) ? 0.0 : salary;
	}
	
	@Override
	public double earnings() {
		return getWeeklySalary();
	}
	
	public String toString() {
		return String.format("salaried employee: %s \n%s: %.2f", super.toString(), 
				"weekly salary", this.getWeeklySalary());
	}
}
