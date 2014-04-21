package chapter5.ObjectOrientedDesignPrinciples.FactoryPattern;

public class Rectangle implements Shape {
	
	private int length;
	private int height;
	
	public Rectangle(int x, int y){
		this.length = x;
		this.height = y;
		
		System.out.println("Rectangle constructor");
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Draw a Rectangle");
		
	}

	@Override
	public void fillColor() {
		// TODO Auto-generated method stub
		System.out.println("Fill color for Rectangle");
	}

}
