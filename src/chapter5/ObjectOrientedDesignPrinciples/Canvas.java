package chapter5.ObjectOrientedDesignPrinciples;

import java.util.Observable;
import java.util.Observer;

public class Canvas implements Observer{

	@Override
	public void update(Observable observable, Object data) {
		// TODO Auto-generated method stub
		System.out.println("Canvas Updated:");
	}

}
