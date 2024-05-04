package in.ashokit.beans;

public class DieselEngine implements IEngine{
	
	public DieselEngine() {
		System.out.println("Diesel Engine Constructor....");
	}
	
	public int start() {
		System.out.println("DieselEngine Started..........");
		return 1;		
	}
}
