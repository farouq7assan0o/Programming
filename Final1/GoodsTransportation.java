package Final1;

//Class for GoodsTransportation that extends FueledTransportation
public class GoodsTransportation extends FueledTransportation {

	// Field to store the weight of goods
	private int weightOfGoods;

	// Constructor that takes in color, weight, fuel capacity and weight of goods
	public GoodsTransportation(String color, int weight, int fuelCapacity, int weightOfGoods) {
		// Call the constructor of the superclass (FueledTransportation)
		super(color, weight, fuelCapacity);
		// Set the weight of goods
		this.weightOfGoods = weightOfGoods;
	}

	// Getter method for weightOfGoods
	public int getWeightOfGoods() {
		return weightOfGoods;
	}
}
