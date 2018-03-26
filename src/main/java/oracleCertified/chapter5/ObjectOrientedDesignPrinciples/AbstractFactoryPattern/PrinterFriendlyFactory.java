package oracleCertified.chapter5.ObjectOrientedDesignPrinciples.AbstractFactoryPattern;

class PrinterFriendlyFactory implements ShapeFactory {

	public Shape getShape(ShapeType shapeType) {
		// TODO Auto-generated method stub
		switch(shapeType){
		case Circle:
			return new PrinterFriendlyCircle(25,35,45);
		case Rectangle:
			return new PrinterFriendlyRectangle(77,88);
		}
		return null;
	}

}
