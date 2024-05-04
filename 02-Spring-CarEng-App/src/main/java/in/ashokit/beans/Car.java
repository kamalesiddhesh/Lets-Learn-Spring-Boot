package in.ashokit.beans;

public class Car {
	private IEngine eng;
	
	public IEngine getEng() {
		return eng;
	}

	public void setEng(IEngine eng) {
		this.eng = eng;
	}

	public Car() {
		System.out.println("Car :: Constructor");
	}
	
	public void drive() {
		int status =  eng.start();
		if(status>=1) {
			System.out.println("Journey Started.....");
		}
		else {
			System.out.println("Engine Trouble.......");
		}
	}

}
