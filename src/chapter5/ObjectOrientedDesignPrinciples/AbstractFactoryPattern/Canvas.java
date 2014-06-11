package chapter5.ObjectOrientedDesignPrinciples.AbstractFactoryPattern;

import java.util.ArrayList;
import java.util.Iterator;

import chapter5.ObjectOrientedDesignPrinciples.FactoryPattern.Shape;
import chapter5.ObjectOrientedDesignPrinciples.FactoryPattern.ShapeFactory;


enum FriendlyType{
	Display,Printer
}

public class Canvas {
	 private static ArrayList<Shape> shapeList = new ArrayList<Shape>();

	 public void addNewShape(FriendlyType friendlyType, ShapeType shapeType){
		 final DisplayFriendlyFactory display = new DisplayFriendlyFactory();
		 final PrinterFriendlyFactory printer = new PrinterFriendlyFactory();
		 switch(friendlyType){
		 case Display:			 
			 Shape shape1 = (Shape) display.getShape(shapeType);
			 shapeList.add(shape1);
		 case Printer:
			 Shape shape2 = (Shape) printer.getShape(shapeType);
			 shapeList.add(shape2);
		 }
		 
			Shape shape = ShapeFactory.getShape(shapeType);
			shapeList.add(shape);
	 }
	 
		public void redraw(){
			Iterator<Shape> itr = shapeList.iterator();
			while(itr.hasNext()){
				Shape shape = itr.next();
				shape.draw();
			}	
		}
	 
}
