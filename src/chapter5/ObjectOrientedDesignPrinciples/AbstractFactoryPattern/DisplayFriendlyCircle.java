package chapter5.ObjectOrientedDesignPrinciples.AbstractFactoryPattern;

class DisplayFriendlyCircle implements DisplayFriendlyShape{
    
	private int xPos, yPos;
	private int radius;
	
	public DisplayFriendlyCircle(int x, int y, int z){
		this.xPos = x;
		this.yPos = y;
		this.radius = z;
		System.out.println("Display Friendly Cirlce Constructor");
	}
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Draw a disply friendly cirlce");
		
	}

	@Override
	public void fillColor() {
		// TODO Auto-generated method stub
		System.out.println("Fill colour for a disply friendly cirlce");
		
	}

}
