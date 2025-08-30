package Transport;

public class EBike extends Bicycle {
	public EBike(String id) {
		super(id);
		// TODO Auto-generated constructor stub
	}
	private int battery;

	public EBike(String id,int battery) {
		super(id);
		this.battery=battery;
		System.out.println("Ebike() constructor called");
		}
		@Override
		public void deliver(String item, String place) {
			System.out.println("checking battery" + battery + "%");
			super.deliver(item,place);
	}
}
