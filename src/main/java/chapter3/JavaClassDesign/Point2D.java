package chapter3.JavaClassDesign;

public class Point2D {
	
	private int xPos, yPos;
	
	public Point2D(int x, int y){
		xPos = x;
		yPos = y;
	}
    
	public String toString(){
		return "x = " + xPos + "    y = " + yPos;
	}
}

