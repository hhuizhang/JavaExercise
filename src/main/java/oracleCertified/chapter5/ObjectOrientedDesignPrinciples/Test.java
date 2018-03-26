package oracleCertified.chapter5.ObjectOrientedDesignPrinciples;

public class Test {
      
//	public static void main(String[] args){
//		
//		Circle circle = new Circle(10,20,20);
//		System.out.println(circle);
//		circle.addObserver(new ShapeAchiver());
//		circle.addObserver(new Canvas());
//		circle.setCenter(new Point(12,22));
//		circle.setRadius(50);
//		System.out.println(circle);
		
		public static void main(String[] args){
			Logger loggerInstance1;
			loggerInstance1 = Logger.getInstance();
			System.out.println(loggerInstance1);
			Logger loggerInstance2;
			loggerInstance2 = Logger.getInstance();
			System.out.println(loggerInstance2);
			Logger loggerInstance3;
			loggerInstance3 = Logger.getInstance();
			System.out.println(loggerInstance3);

			
	}
}
