package Transport;

public interface Payable {
	double cost (double distancekm);

	void deliver(String item, String place);
}
