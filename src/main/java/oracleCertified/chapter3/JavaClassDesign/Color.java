package oracleCertified.chapter3.JavaClassDesign;

public class Color {
	private int red, green, blue;
	
	Color(){
		this(10,10,10);
	}
	
	Color(int a, int b, int c){
		red = a;
		green = b;
		blue = c;
		
	}
	
	void printColor(){
		System.out.println("red = " + red +" green = " + green + " blue = " + blue);
	}
	
	public String toString(){
		return "The color is " + red + green + blue;
	}
	public static void main(String []agrs){
		Color c1 = new Color();
	    System.out.println(c1);
	}

}
