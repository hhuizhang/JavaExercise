package oracleCertified.chapter5.ObjectOrientedDesignPrinciples.FactoryPattern;





enum SourceType{
	Circle, Rectangle
}

class ShapeFactory {
	
	public static Shape getShape(SourceType sourceType){
		switch(sourceType){
		case Circle:
			return new Circle(10,20,30);
		case Rectangle:
			return new Rectangle(25,35);		
		}
		return null;
	}


}
