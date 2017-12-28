package chapter5.ObjectOrientedDesignPrinciples.AbstractFactoryPattern;

class PrinterFriendlyRectangle implements PrinterFriendlyShape {
    
	private int length;
	private int height;
	
	public PrinterFriendlyRectangle(int x, int y){
		this.length = x;
		this.height = y;
		System.out.println("Printer Friendly Rectangle constructor");
	}

	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Draw a printer friendly rectangle");
	}

	public void fillColor() {
		// TODO Auto-generated method stub
		System.out.println("Fill colour for a printer friendly rectangle");
	}

}
