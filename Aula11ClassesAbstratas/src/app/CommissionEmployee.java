package app;

public class CommissionEmployee extends Employee{
	private double grossSales;
	private double commissionRate;
	
	public CommissionEmployee (String first, String last, String ssn, double sales, 
			double rate) {
		super(first, last, ssn);
		this.setGrossSales(sales);
		this.setCommissionRate(rate);
	}

	public double getGrossSales() {
		return grossSales;
	}

	public void setGrossSales(double grossSales) {
		this.grossSales = grossSales;
	}

	public double getCommissionRate() {
		return commissionRate;
	}

	public void setCommissionRate(double commissionRate) {
		this.commissionRate = commissionRate;
	}
	
	public double earnings() {
		return getCommissionRate() * getGrossSales();
	}
	
	public String toString() {
		return String.format("%s: %s\n%s: %.2f\n%s: %.2f", "commission employee"
				, super.toString(), "gross sales", this.getGrossSales(),
				"commission rate", this.getCommissionRate());
	}

	@Override
	public double getPaymentAmount() {
		// TODO Auto-generated method stub
		return 0;
	}
}
