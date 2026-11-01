//Arkadii Redozubov 3187445
package griffith;

import java.util.ArrayList;

//implements interface ShapeManager, inherits its unimplemented abstract methods
public class Canvas implements ShapeManager{
	
	private ArrayList<Shape> shapes;
	private double width;
	private double height;

	
	public Canvas(double width, double height) {
//		Initialize ArrayList in constructor call
		shapes = new ArrayList<>();
		this.width = width;
		this.height = height;
		
	}
	
//Add shape to the list if it is in bounds  
	@Override
	public boolean addShape(Shape shape) {
		if(shape.inBounds(width, height)){
			shapes.add(shape);
			return true;
		}
		return false;
	}

//	Return the list of the shapes filtered by the specific color 
	@Override
	public ArrayList<Shape> getByColor(String color) {
		ArrayList<Shape> shapesUpdated = new ArrayList<>();
		for(Shape shape: shapes) {
			if(shape.getColor().equals(color)) {
				shapesUpdated.add(shape);
			}
		}
		return shapesUpdated;
		
	}

//	Return the list of 2D shapes 
	@Override
	public ArrayList<Shape> get2D() {
		ArrayList<Shape> shapesUpdated = new ArrayList<>();
		for(Shape shape: shapes) {
//			Check if shape implements TwoDimensional interface
			if(shape instanceof TwoDimensional) {
				shapesUpdated.add(shape);
			}
		}
		return shapesUpdated;
	}

//	Return the list of 3D shapes 
	@Override
	public ArrayList<Shape> get3D() {
		ArrayList<Shape> shapesUpdated = new ArrayList<>();
		for(Shape shape: shapes) {
//			Check if shape implements ThreeDimensional interface
			if(shape instanceof ThreeDimensional) {
				shapesUpdated.add(shape);
			}
		}
		return shapesUpdated;
	}
	
//	Getters and setters
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	
//	Use StringBuilder and .format to return info without square brackets 
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(String.format("Canvas (%.2f, %.2f)",width, height));
		for(Shape shape: shapes) {
			builder.append("\n" + shape);
		}
		return builder.toString();
	}

}
