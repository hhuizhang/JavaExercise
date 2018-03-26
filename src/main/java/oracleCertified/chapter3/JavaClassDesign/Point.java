package oracleCertified.chapter3.JavaClassDesign;

public class Point {
	
	private int xPos, yPos;
	
	public Point(int x, int y){
		xPos = x;
		yPos = y;
	}
	
	@Override
	public boolean equals(Object others){
		if(others == null)
			return false;
		
		if(others instanceof Point){
			Point anotherPoint = (Point)others;
		    if((xPos == anotherPoint.xPos)&&(yPos == anotherPoint.yPos))
			   return true;	  
		}
		return false;
		
	}
	
	public static void main(String [] args){
/*	    Point p1 = new Point(10,50);
		Point p2 = new Point(10,100);
		Point p3 = new Point(10,50);*/
		
 		Object p1 = new Point(10,50);
		Object p2 = new Point(10,100);
		Object p3 = new Point(10,50);
		
		System.out.println("p1 equals p2 is " + p1.equals(p2));
		System.out.println("p1 equals p3 is " + p1.equals(p3));
		System.out.println(p1);
		System.out.println(p2);
	}
	

}
