package Final1;

class Transportation {
	// instance variables to store the color and weight of a transportation
	private String color;
	private int weight;

	// Constructor to initialize the instance variables with the passed values
	public Transportation(String color, int weight) {
		this.color = color;
		this.weight = weight;
	}

	// Method to get the color of the transportation
	public String getColor() {
		return color;
	}

	// Method to get the weight of the transportation
	public int getWeight() {
		return weight;
	}
}
