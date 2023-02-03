package Final1;

public class Truck extends GoodsTransportation {
	// Constructor for the truck class, takes in parameters for color, weight, fuel
	// capacity, and weight of goods
	public Truck(String color, int weight, int fuelCapacity, int weightOfGoods) {
		// Calls the super class' constructor, passing in the color, weight, and fuel
		// capacity parameters
		super(color, weight, fuelCapacity, weightOfGoods);
	}
}
