package chapter4.AdvancedClassDesign;

//enum PrinterType{
//	DOTMATRIX, INKJET, LASER;
//}

public class EnumTest {
	
	PrinterType printerType;
	
	public EnumTest(PrinterType pType){
		printerType = pType;
	}
    
	public void feature(){
		switch(printerType){
		case DOTMATRIX:
			System.out.println("Dot-Matrix printers are economical and almost obsolete");
			break;
		case INKJET:
			System.out.println("Inkjet printers provide decent quality prints");
			break;
		case LASER:
			System.out.println("Laser printers provide best quality prints");
			break;
		}
		
		System.out.println("Print page capactiy per minute" + printerType.getPagePrintCapacity() );
	}
	
	public static void main(String[] args){
		EnumTest enumTest1 = new EnumTest(PrinterType.LASER);
		enumTest1.feature();
		
		EnumTest enumTest2 = new EnumTest(PrinterType.DOTMATRIX);
		enumTest2.feature();
		
		//System.out.println(PrinterType.name()); 
	}
}
