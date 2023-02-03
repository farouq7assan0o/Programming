package Final1;

public class Horse extends NonFueledTransportation {

	// Constructor to initialize the color and weight of the horse
	public Horse(String color, int weight) {
		// Call the constructor of the superclass NonFueledTransportation
		super(color, weight, true);
		// Call the superclass constructor and pass the color and weight

	}
}
