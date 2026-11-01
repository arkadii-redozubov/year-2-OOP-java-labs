//Arkadii Redozubov 3187445
package griffith;

//Extends parent class Shape, inherits its attributes and methods, 
//implements interface ThreeDimensional, inherits its unimplemented abstract methods
public class Cube extends Shape implements ThreeDimensional{
	
	private double length;

	public Cube(String color, int x, int y, double length) {
//		Call super() to initialize inherited attributes 
		super(color, x, y);
		this.length = length;
	}

//	Set own implementation of the abstract methods 
	@Override
	public double volume() {
		return Math.pow(length, 3);
	}

	@Override
	public double surfaceArea() {
		return 6 * Math.pow(length, 2);
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
			"\tVolume: %.2f\n" + 
		    "\tSurface area: %.2f", super.toString(), length, volume(), surfaceArea());
	}
	

}
