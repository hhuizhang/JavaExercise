package chapter5.ObjectOrientedDesignPrinciples;

import java.util.Observable;
import java.util.Observer;

public class ShapeAchiver implements Observer {

	public void update(Observable observable, Object data) {
		// TODO Auto-generated method stub
		System.out.println("ShapeAchiver Updated:");
	}

}
