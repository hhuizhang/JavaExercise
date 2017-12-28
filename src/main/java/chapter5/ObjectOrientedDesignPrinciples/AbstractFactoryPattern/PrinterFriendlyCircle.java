package chapter5.ObjectOrientedDesignPrinciples.AbstractFactoryPattern;

class PrinterFriendlyCircle implements PrinterFriendlyShape{
	private int xPos, yPos;
	private int radius;
	
	public PrinterFriendlyCircle(int x, int y, int z){
		this.xPos = x;
		this.yPos = y;
		this.radius = z;
		System.out.println("Printer Friendly Cirlce Constructor");
	}

	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Draw a printer friendly cirlce");
		
	}

	public void fillColor() {
		// TODO Auto-generated method stub
		System.out.println("Fill colour for a printer friendly cirlce");
		
	}

}
