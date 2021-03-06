package oracleCertified.chapter5.ObjectOrientedDesignPrinciples.AbstractFactoryPattern;

class DisplayFriendlyFactory implements ShapeFactory {

	public  Shape getShape(ShapeType shapeType) {
		// TODO Auto-generated method stub
		switch(shapeType){
		case Circle:
			return new DisplayFriendlyCircle(10,20,30);
		case Rectangle:
			return new DisplayFriendlyRectangle(25,35);
		}
		return null;
	}

}
