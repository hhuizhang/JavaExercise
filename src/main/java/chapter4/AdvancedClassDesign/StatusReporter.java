package chapter4.AdvancedClassDesign;

public class StatusReporter {
	
	static Shape.Color getDescriptiveColor(final Shape.Color color){
		
//		class DescriptiveColor extends Shape.Color {
//			public String toString(){
//				return "You selected a color with RGB values" + color;
//			}
//		}
//		
//		return new DescriptiveColor();
		
		return new Shape.Color(){
			public String toString(){
				return "You selected a color with RGB values" + color;
			}
		};
	}
	
	public static void main (String []args){
		Shape.Color descriptiveColor = StatusReporter.getDescriptiveColor(new Shape.Color(0,0,0));
		System.out.println(descriptiveColor);
	}

}
