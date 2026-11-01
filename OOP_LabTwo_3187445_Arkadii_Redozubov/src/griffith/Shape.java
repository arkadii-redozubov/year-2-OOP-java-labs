//Arkadii Redozubov 3187445
package griffith;

public abstract class Shape {
	private int x;  
	private int y;
    private String color; 

    public Shape(String color,int x, int y) {
        this.color = color;
		this.x = x;
		this.y =y;
    }

    public String getColor() {
        return color;  
    }
    public int getX(){
		return x;
	}
	public int getY(){
		return y;
	}
	public void setX(int x){
		this.x = x;
	}
	public void setY(int y){
		this.y = y;
	}
	//return false if a shapes x or y are outside the canvas height and width 
	public abstract boolean inBounds(double width, double height); 
	
    public String toString() {
        return "\nShape: " + getClass().getSimpleName() +"\nPosition: " + x + ","+y +"\nColor: " + color;
    }
}

