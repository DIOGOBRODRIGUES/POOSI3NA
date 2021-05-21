package app;

public class PayableInterfaceTest {

	public static void main(String[] args) {
		Payable payableObject [] = new Payable[4];
		
		payableObject[0] = new Invoice("12345", "luz", 2, 326.5);
		payableObject[1] = new Invoice ("65688", "aluguel", 3, 100.5);
		payableObject[2] = new SalariedEmployee("Anderson", "Oliveira", "45656", 10000);
		payableObject[3] = new SalariedEmployee("Jairo", "Filho", "2355", 10000);
		
		System.out.println("Invoices and Employees Processed polymorphically:\n");
		
		for(Payable currentPayable : payableObject) {
			System.out.printf("%s \n%s: $%,.2f\n\n", currentPayable.toString(), 
					"Payament Due", currentPayable.getPaymentAmount());
		}

	}

}
