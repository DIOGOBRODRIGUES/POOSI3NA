package app;

public class MyPoint {
	private int x;
	private int y;
	
	public MyPoint() {
		this.x = 0;
		this.y = 0;
	}
	
	public MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public void setXY (int x, int y) {
		this.x  = x;
		this.y = y;
	}
	
	public double distance(int x, int y) {
		double resultado = 0;
		double v1 = Math.pow((this.x - x), 2);
		double v2 = Math.pow((this.y - y), 2);
		resultado = Math.sqrt(v1+v2);
		return resultado;
	}
	
	public double distance(MyPoint p) {
		return this.distance(p.getX(), p.getY());
	}
	
	public String toString() {
		String resultado = "My point ("+this.x+", "+this.y+")";
		return resultado;
	}
	
	public boolean equals (MyPoint other) {
		boolean resultado = false; 
		if(other!= null) {
			resultado = (this.x == other.getX()) && (this.y == other.getY());
		}
		return resultado;
	}
}
