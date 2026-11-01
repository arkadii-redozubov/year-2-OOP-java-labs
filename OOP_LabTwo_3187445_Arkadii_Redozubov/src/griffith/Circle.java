//Arkadii Redozubov 3187445
package griffith;

//Extends parent class Shape, inherits its attributes and methods, 
//implements interface TwoDimensional, inherits its unimplemented abstract methods
public class Circle extends Shape implements TwoDimensional{
	private double radius;
	
	public Circle(String color, int x, int y, double radius) {
//		Call super() to initialize inherited attributes 
		super(color, x, y);
		this.radius = radius;
		
	}
	
//	Set own implementation of the abstract methods 
	@Override
	public double area() {
		return Math.PI * Math.pow(radius, 2);
	}
	
	@Override
	public double perimeter() {
		return 2 * Math.PI * radius;
	}
	
//	Check whether the shape is in bounds
	@Override
	public boolean inBounds(double width, double height) {
		if((super.getX() < 0) || (super.getY() < 0) ||
		  (super.getX() + radius * 2) > width || (super.getY() + radius * 2) > height) {
			return false; 
		}
		return true;
	}


	public double getRadius() {
		return radius;
	}


//	Use .format to return rounded info
	@Override
	public String toString() {
		return String.format(
			"%s\n" + 
		    "\tRadius: %.2f\n" +
			"\tArea: %.2f\n" + 
		    "\tPerimeter: %.2f", super.toString(),radius, area(), perimeter());
	}
	
	


	

}
