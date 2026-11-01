//Arkadii Redozubov 3187445
package griffith;

//Extends parent class Shape, inherits its attributes and methods, 
//implements interface ThreeDimensional, inherits its unimplemented abstract methods
public class Sphere extends Shape implements ThreeDimensional{
	
	private double radius;

	public Sphere(String color, int x, int y, double radius) {
//		Call super() to initialize inherited attributes 
		super(color, x, y);
		this.radius = radius;
	}

//	Set own implementation of the abstract methods 
	@Override
	public double volume() {
		return 4.0/3.0 * Math.PI * Math.pow(radius, 3);
	}


	@Override
	public double surfaceArea() {
		return 4 * Math.PI * Math.pow(radius, 2);
	}

//	Check whether the shape is in bounds 
	@Override
	public boolean inBounds(double width, double height) {
		if((super.getX() < 0) || (super.getY() < 0) || 
		(super.getX() + radius*2) > width || (super.getY() + radius*2) > height) {
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
			"\tVolume: %.2f\n" + 
		    "\tSurface area: %.2f", super.toString(), radius, volume(), surfaceArea());
	}


}
