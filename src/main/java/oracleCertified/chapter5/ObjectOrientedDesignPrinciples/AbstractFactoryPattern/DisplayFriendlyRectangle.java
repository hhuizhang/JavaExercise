package oracleCertified.chapter5.ObjectOrientedDesignPrinciples.AbstractFactoryPattern;

class DisplayFriendlyRectangle implements DisplayFriendlyShape{
	
	private int length;
	private int height;
	
	public DisplayFriendlyRectangle(int x, int y){
		this.length = x;
		this.height = y;
		System.out.println("Display Friendly Rectangle constructor");
	}

	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Draw a disply friendly rectangle");
	}

	public void fillColor() {
		// TODO Auto-generated method stub
		System.out.println("Fill colour for a disply friendly rectangle");
	}

}
