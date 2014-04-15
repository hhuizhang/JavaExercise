package chapter4.AdvancedClassDesign;

public class Circle {
	
	class Point{
		
		private int xPos, yPos;
		public Point(int x, int y){
			xPos = x;
			yPos = y;
		}
		
		public String toString(){
			return "(" + xPos + " £¬ " + yPos +")";
		}
	}
	
	private Point center;
	private int radius;
	
	public Circle(int x, int y, int z){
		center = this.new Point(x, y);
		radius = z;
	}
    
	public String toString(){
		return "mid point = " + center + " and radius = " + radius; 
	}
	
	public static void main(String[] agv){
	   System.out.println(new Circle(10,20,30));
	}
}
