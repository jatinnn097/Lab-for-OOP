package Transport;

public abstract class Vehicle1 {
	protected String id;
	public  Vehicle1 (String id) {
		System.out.println("Vehicle () constructor is called");
	}
	public abstract void deliver(String item, String place);


}
