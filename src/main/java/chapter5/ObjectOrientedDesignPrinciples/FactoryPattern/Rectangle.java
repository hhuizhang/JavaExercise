package chapter5.ObjectOrientedDesignPrinciples.FactoryPattern;

class Rectangle implements Shape {
	
	private int length;
	private int height;
	
	public Rectangle(int x, int y){
		this.length = x;
		this.height = y;
		
		System.out.println("Rectangle constructor");
	}

	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Draw a Rectangle");
		
	}

	public void fillColor() {
		// TODO Auto-generated method stub
		System.out.println("Fill color for Rectangle");
	}

}
