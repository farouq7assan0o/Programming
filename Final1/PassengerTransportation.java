package Final1;

public class PassengerTransportation extends FueledTransportation {
	private int numberOfPeople;

	/**
	 * Class constructor to set the color, weight, fuelCapacity and numberOfPeople
	 * properties of the PassengerTransportation object color the color of the
	 * transportation object weight the weight of the transportation object
	 * fuelCapacity the fuel capacity of the transportation object numberOfPeople
	 * the number of people the transportation can carry
	 */
	public PassengerTransportation(String color, int weight, int fuelCapacity, int numberOfPeople) {
		super(color, weight, fuelCapacity);
		this.numberOfPeople = numberOfPeople;
	}

	/**
	 * Getter method to retrieve the numberOfPeople property of the
	 * PassengerTransportation object
	 * 
	 * @return the numberOfPeople property
	 */
	public int getNumberOfPeople() {
		return numberOfPeople;
	}
}
