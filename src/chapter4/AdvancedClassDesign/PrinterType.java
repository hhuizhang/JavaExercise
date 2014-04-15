package chapter4.AdvancedClassDesign;

public enum PrinterType {
	
	DOTMATRIX(5), INKJET(10),LASER(50);
	
	int pagePrintCapacity;
	
	private PrinterType(int pagePrintCapacity){
		this.pagePrintCapacity = pagePrintCapacity;
	}
	
	int getPagePrintCapacity(){
		return pagePrintCapacity;
	}

}
