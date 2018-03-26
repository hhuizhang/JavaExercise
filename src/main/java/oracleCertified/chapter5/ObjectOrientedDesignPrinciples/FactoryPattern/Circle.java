package oracleCertified.chapter5.ObjectOrientedDesignPrinciples.FactoryPattern;

class Circle implements Shape{
	private int xPos, yPos;
	private int radius;
	
	public Circle(int x, int y, int z){
		this.xPos = x;
		this.yPos = y;
		this.radius = z;
		System.out.println("Circle constructor");
	}
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Draw a Circle");
		
	}
	public void fillColor() {
		// TODO Auto-generated method stub
		System.out.println("Fill color for Circle");
	}
	
	
}
