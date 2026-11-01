//Arkadii Redozubov 3187445
package griffith;

//Extends parent class Shape, inherits its attributes and methods, 
//implements interface TwoDimensional, inherits its unimplemented abstract methods
public class Triangle extends Shape implements TwoDimensional {
	
	private double base;
	private double triangleHeight;
	
	public Triangle(String color, int x, int y, double base, double triangleHeight) {
//		Call super() to initialize inherited attributes 
		super(color, x, y);
		this.base = base;
		this.triangleHeight = triangleHeight;
	}

//	Set own implementation of the abstract methods 
	@Override
	public double area() {
		return 0.5 * base * triangleHeight;
	}

	@Override
	public double perimeter() {
		return base + triangleHeight + Math.sqrt(Math.pow(base, 2) + Math.pow(triangleHeight, 2));
	}

	
//	Check whether the shape is in bounds 
	@Override
	public boolean inBounds(double width, double height) {
		if((super.getX() < 0) || (super.getY() < 0) || 
		  (super.getX() + base) > width || (super.getY() + triangleHeight) > height) {
			return false; 
		}
		return true;
	}
	
	public double getBase() {
		return base;
	}

	public double getHeight() {
		return triangleHeight;
	}

//	Use .format to return rounded info
	@Override
	public String toString() {
		return String.format(
			"%s\n" + 
		    "\tBase: %.2f\n" +
			"\tHeight: %.2f\n" + 
		    "\tArea: %.2f\n" + 
		    "\tPerimeter: %.2f", super.toString(), base, triangleHeight, area(), perimeter());
	}


	
	

}
