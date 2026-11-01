//Arkadii Redozubov 3187445
package griffith;

import java.util.ArrayList;

public interface ShapeManager{
	boolean addShape(Shape shape); // add shape to list, if a shape is not in bounds do not add and return false 
	ArrayList<Shape> getByColor(String color);// return all shapes of that color. 
	ArrayList<Shape> get2D();// return just two Dimensional shapes
	ArrayList<Shape> get3D();// return just three Dimensional shapes
}
