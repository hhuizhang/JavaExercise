package oracleCertified.chapter4.AdvancedClassDesign;

public class TestColor {
	
	public static void main(String []args){
		Shape.Color c1 = new Shape.Color();
		System.out.println(c1);
		
		Shape.Color c2 = new Shape.Color(10,10,10);
		System.out.println(c2);
		
		Shape.Color white = new Shape.Color(255, 255, 255);
		System.out.println("The value of white is " + white);
		
	}

}
