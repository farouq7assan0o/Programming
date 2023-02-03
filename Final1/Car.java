package Final1;

/**
 * The Car class is a subclass of PassengerTransportation.
 */
public class Car extends PassengerTransportation {
	/**
	 * Constructor for the Car class.
	 *
	 * @param color          the color of the Car
	 * @param weight         the weight of the Car
	 * @param fuelCapacity   the fuel capacity of the Car
	 * @param numberOfPeople the number of people the Car can carry
	 */
	public Car(String color, int weight, int fuelCapacity, int numberOfPeople) {
		super(color, weight, fuelCapacity, numberOfPeople);
	}
}
