package chapter4.AdvancedClassDesign;

import chapter4.AdvancedClassDesign.Shape.Color;

public class TestColor {
	
	public static void main(String []args){
		Color c1 = new Color();
		System.out.println(c1);
		
		Color c2 = new Color(10,10,10);
		System.out.println(c2);
		
		Shape.Color white = new Shape.Color(255, 255, 255);
		System.out.println("The value of white is " + white);
		
	}

}
