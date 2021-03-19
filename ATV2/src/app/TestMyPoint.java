package app;

public class TestMyPoint {

	public static void main(String[] args) {
		MyPoint p1  = new MyPoint();
		
		p1.setX(0);
		p1.setY(4);
		
		MyPoint p2 = new MyPoint(3, 0);
		
		double r1 = p1.distance(p2);
		double r2 = p1.distance(p2.getX(), p2.getY());
		
		System.out.println(p1);
		System.out.println(p2);
		
		System.out.println("R1 = "+r1);
		System.out.println("R2 = "+r2);
		
		System.out.println("Equals: "+p1.equals(p2));
		
		p2.setX(p1.getX());
		p2.setY(p1.getY());
		System.out.println("Equals: "+p1.equals(p2));
		
	}

}
