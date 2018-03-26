package oracleCertified.chapter5.ObjectOrientedDesignPrinciples.AbstractFactoryPattern;

import java.util.ArrayList;
import java.util.Iterator;

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
	 }
	 
		public void redraw(){
			Iterator<Shape> itr = shapeList.iterator();
			while(itr.hasNext()){
				Shape shape = itr.next();
				shape.draw();
			}	
		}
	 
}
