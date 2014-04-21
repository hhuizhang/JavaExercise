package chapter5.ObjectOrientedDesignPrinciples.AbstractFactoryPattern;

public class DisplayFriendlyFactory implements ShapeFactory {

	@Override
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
