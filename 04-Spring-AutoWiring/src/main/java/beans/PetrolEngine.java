package beans;

public class PetrolEngine implements IEngine{
	/*
	 * public PetrolEngine() {
	 * System.out.println("Petrol Engine Constructor Created........."); }
	 */
	public int start() {
		System.out.println("Petrol Engine Started...........");
		return 1;
	}
}
