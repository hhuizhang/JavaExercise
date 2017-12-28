package chapter3.JavaClassDesign;

public class Point3D extends Point2D {
    private int zPos;
	
	public Point3D(int x, int y, int z){
		super(x,y);	
		zPos = z;

	}
	
	@Override
	public String toString(){
		return super.toString() +" z = " + zPos;
	}
	
	public static void main(String []args){
		Point3D p = new Point3D(10,20,30);
		System.out.println(p.toString());
	}
}
