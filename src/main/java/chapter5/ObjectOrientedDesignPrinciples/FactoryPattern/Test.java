package chapter5.ObjectOrientedDesignPrinciples.FactoryPattern;

public class Test {
	
	public static void main(String[] args){
		Canvas canvas = new Canvas();
		canvas.addNewShape(SourceType.Circle);
		canvas.addNewShape(SourceType.Rectangle);
		canvas.addNewShape(SourceType.Circle);
		canvas.addNewShape(SourceType.Rectangle);
		canvas.redraw();
		
	}
}
