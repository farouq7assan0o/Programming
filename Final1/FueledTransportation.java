package Final1;

// The `FueledTransportation` class extends the `Transportation` class

public class FueledTransportation extends Transportation {

	// Fuel capacity of the transportation
	private int fuelCapacity;

	/**
	 * Constructor for `FueledTransportation` class
	 * 
	 * @param color        color of the transportation
	 * @param weight       weight of the transportation
	 * @param fuelCapacity fuel capacity of the transportation
	 */

	public FueledTransportation(String color, int weight, int fuelCapacity) {
		super(color, weight);
		this.fuelCapacity = fuelCapacity;
	}

	/**
	 * Getter method for fuel capacity
	 * 
	 * @return fuel capacity of the transportation
	 */
	public int getFuelCapacity() {
		return fuelCapacity;
	}
}
