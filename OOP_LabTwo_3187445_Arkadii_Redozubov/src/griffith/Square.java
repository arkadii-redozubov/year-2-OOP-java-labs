//Arkadii Redozubov 3187445
package griffith;

//Extends parent class Shape, inherits its attributes and methods, 
//implements interface TwoDimensional, inherits its unimplemented abstract methods
public class Square extends Shape implements TwoDimensional{
	
	private double length;
	
	public Square(String color, int x, int y, double length) {
//		Call super() to initialize inherited attributes 
		super(color, x, y);
		this.length = length;
	}
	
//	Set own implementation of the abstract methods 
	@Override
	public double area() {
		return length * length;
	}

	@Override
	public double perimeter() {	
		return length * 4;
	}

//	Check whether the shape is in bounds  
	@Override
	public boolean inBounds(double width, double height) {
		if((super.getX() < 0) || (super.getY() < 0) ||
		(super.getX() + length) > width || (super.getY() + length) > height) {
			return false; 
		}
		return true;
	}


	public double getLength() {
		return length;
	}

//	Use .format to return rounded info
	@Override
	public String toString() {
		return String.format(
			"%s\n" + 
		    "\tLength: %.2f\n" +
			"\tArea: %.2f\n" + 
		    "\tPerimeter: %.2f", super.toString(),length, area(), perimeter());
	}



	
	
	

}
