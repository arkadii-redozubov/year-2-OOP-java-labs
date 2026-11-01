//Arkadii Redozubov 3187445
package griffith;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
//		Object of Canvas
		Canvas canvas = new Canvas(400, 600);
//		Add square objects
		canvas.addShape(new Square("black", 5, 10, 10));
		canvas.addShape(new Square("blue", 7, 12, 50));
//		Add circle objects
		canvas.addShape(new Circle("red", 5, 10, 20));
		canvas.addShape(new Circle("yellow", 4, 12, 15));
//		Add triangle objects
		canvas.addShape(new Triangle("blue", 10, 50, 20, 30));
		canvas.addShape(new Triangle("purple", 40, 6, 3, 9));
//		Add cube objects
		canvas.addShape(new Cube("white", 5, 15, 64));
		canvas.addShape(new Cube("black", 8, 2, 47));
//		Add sphere objects
		canvas.addShape(new Sphere("brown", 69, 34, 47));
		canvas.addShape(new Sphere("yellow", 99, 25, 78));
		
		System.out.println(canvas);
		
//		Test adding shapes that are out of bounds, successfully added (true), out of bounds (false)
		System.out.println("\nTest out of bounds shapes");
		System.out.println("Attempt to add out of bounds sphere: " + 
				canvas.addShape(new Sphere("yellow", 399, 205, 780)));
		System.out.println("Attempt to add out of bounds circle: " + 
				canvas.addShape(new Circle("blue", 345, 206, 580)));
		
//		Test printing only 2 dimensional shapes
		System.out.println("\n2D SHAPES");
		for(Shape shape: canvas.get2D()) {
			System.out.println(shape);
		}
		
//		Test printing only 3 dimensional shapes
		System.out.println("\n3D SHAPES");
		for(Shape shape: canvas.get3D()) {
			System.out.println(shape);
		}
		
//		Test printing only blue shapes
		System.out.println("\nBLUE SHAPES");
		for(Shape shape: canvas.getByColor("blue")) {
			System.out.println(shape);
		}
		
//		Print the largest area across 2D shapes
		ArrayList<Shape> shapes2D = canvas.get2D();
		Shape largestArea = shapes2D.get(0);
		for(Shape shape: shapes2D) {
//			Downcast Shape class to access its area method
			if(((TwoDimensional)shape).area() > ((TwoDimensional)largestArea).area()) {
				largestArea = shape;
			}
		}
		System.out.println("\nLargest area across 2D figures:\n" + 
				"Color: " + largestArea.getColor() + "\n" + 
//				.simpleName(), returns the name of the class without package
				"Class: " + largestArea.getClass().getSimpleName());
		
		
		ArrayList<Shape> shapes3D = canvas.get3D();
		Shape largestVolume = shapes3D.get(0);
		for(Shape shape: shapes3D) {
//			Downcast Shape class to access its volume method
			if(((ThreeDimensional)shape).volume() > ((ThreeDimensional)largestVolume).volume()) {
				largestVolume = shape;
			}
		}
		System.out.println("\nLargest volume across 3D figures:\n" + 
				"Color: " + largestVolume.getColor() + "\n" + 
//				.getSimpleName(), returns the class name without the package
				"Class: " + largestVolume.getClass().getSimpleName());
		
	}
	

}
