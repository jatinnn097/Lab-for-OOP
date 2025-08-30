package Transport;

public class Drone extends Vehicle1 implements Payable {

	public Drone(String id) {
		super(id);
		System.out.println("Drone() constructor called");
	}

	@Override
	public double cost(double distancekm) {
		return 20*distancekm;
	}

	@Override
	public void deliver(String item, String place) {
		if (!SecurityRules.canFly(place)) {
			System.out.println("Delivery to " + place + " is blocked by security");
            return;
		}
	    System.out.println("Delivering " + item + " to " + place + " by Drone");
	}



}
