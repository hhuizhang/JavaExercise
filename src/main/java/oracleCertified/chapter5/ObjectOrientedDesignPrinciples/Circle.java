package oracleCertified.chapter5.ObjectOrientedDesignPrinciples;

import java.util.Observable;

public class Circle extends Observable{
       
	private Point center;
	private int radius;
	
	public Circle(int x, int y, int z){
		center = new Point(x,y);
		radius = z;	
	}
	
	public void setCenter(Point center){
		this.center = center;
		setChanged();
		notifyObservers();
	}
	
	public void setRadius(int radius){
		this.radius = radius;
		setChanged();
		notifyObservers();
	}
    
	public String toString(){
		return "Center = " + center + "and Radius = " + radius;
	}
}
