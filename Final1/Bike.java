package Final1;

//Class definition for Bike, a subclass of NonFueledTransportation
public class Bike extends NonFueledTransportation {
//Constructor that sets color and weight and calls the constructor of the superclass
	public Bike(String color, int weight) {
//Call the superclass constructor and pass the color and weight
		super(color, weight, false);
	}
}