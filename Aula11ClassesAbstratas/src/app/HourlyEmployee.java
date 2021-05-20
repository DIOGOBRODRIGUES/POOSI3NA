package app;

public class HourlyEmployee extends Employee{
	private double wage;
	private double hours;
	
	public HourlyEmployee(String first, String last, String ssn, double hourlyWage,
			double hoursWorked) {
		super(first, last, ssn);
		this.setWage(hourlyWage);
		this.setHours(hoursWorked);
	}

	public double getWage() {
		return wage;
	}

	public void setWage(double wage) {
		this.wage = wage;
	}

	public double getHours() {
		return hours;
	}

	public void setHours(double hours) {
		this.hours = hours;
	}
	
	@Override
	public double earnings() {
		if(getHours() <= 40)
			return getWage() * getHours();
		else
			return 40* getWage() + (getHours() - 40) *  getWage() * 1.5;
	}
	
	public String toString() {
		return String.format("hourly employee: %s\n %s: %.2f %s: %.2f", super.toString()
				,"hourly wage",this.getWage(), "hours worked", this.getHours());
	}

	@Override
	public double getPaymentAmount() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
