package app;

public abstract class Employee implements Payable {
	private String firstName;
	private String lastName;
	private String socialSecurityNumber;
	
	public Employee(String first, String last, String ssn) {
		this.firstName = first;
		this.lastName = last;
		this.socialSecurityNumber = ssn;
	}
	
	//Método abstrato, isto é, sem implementação
	public abstract double earnings();
	
	public String getFirstName() {
		return this.firstName;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	public String getSocialSecurityNumber() {
		return this.socialSecurityNumber;
	}
	

	
	public String toString() {
		return String.format("%s %s \nsocial security number %s", getFirstName(), getLastName(),
				getSocialSecurityNumber());
	}
	
	
	
	
}
