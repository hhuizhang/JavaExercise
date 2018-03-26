package oracleCertified.chapter5.ObjectOrientedDesignPrinciples.AbstractFactoryPattern;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Canvas canvas = new Canvas();
       canvas.addNewShape(FriendlyType.Display, ShapeType.Circle);
       canvas.addNewShape(FriendlyType.Printer, ShapeType.Circle);
       canvas.addNewShape(FriendlyType.Display, ShapeType.Rectangle);
       canvas.addNewShape(FriendlyType.Printer, ShapeType.Rectangle);
       canvas.redraw();
	}

}
