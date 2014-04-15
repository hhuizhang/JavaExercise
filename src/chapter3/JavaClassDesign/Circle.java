package chapter3.JavaClassDesign;

class Circle {
	
	int xPos, yPos, radius;
	
	public  Circle(){
		xPos = 20;
		yPos = 20;
		radius = 10;
	}
	
	public String toString(){
		return "center = (" + xPos + "," + yPos +") and radius = " + radius;
	}
	
    public static  void main(String agrs[]){
    	
    	//System.out.println(toString(new Circle()));
    	System.out.println(new Circle());
    	
    }

}