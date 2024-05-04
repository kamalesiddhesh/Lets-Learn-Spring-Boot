package beans;

public class Car {
	IEngine engine;
	
	public Car(IEngine engine) {
		System.out.println("Car :: Parameterized Constructor");
		this.engine = engine;
	}

	public IEngine getEngine() {
		return engine;
	}

	public void setEngine(IEngine engine) {
		this.engine = engine;
	}
	
	public void drive() {
		int status =  engine.start();
		if(status>=1) {
			System.out.println("Journey Started.....");
		}
		else {
			System.out.println("Engine Trouble.......");
		}
	}

}
