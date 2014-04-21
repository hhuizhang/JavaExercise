package chapter5.ObjectOrientedDesignPrinciples.AbstractFactoryPattern;

enum ShapeType{
	Circle,Rectangle
}
public interface ShapeFactory {
	
	public Shape getShape(ShapeType shapeType);
	
}
