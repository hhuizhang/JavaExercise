package chapter5.ObjectOrientedDesignPrinciples;

public class Test {
      
	public static void main(String[] args){
		
		Circle circle = new Circle(10,20,20);
		System.out.println(circle);
		circle.addObserver(new ShapeAchiver());
		circle.addObserver(new Canvas());
		circle.setCenter(new Point(12,22));
		circle.setRadius(50);
		System.out.println(circle);
	}
}
