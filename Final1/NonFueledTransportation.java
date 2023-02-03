package Final1;

public class NonFueledTransportation extends Transportation {
	private boolean isOrganism;

	/**
	 * Class constructor to set the color, weight and isOrganism properties of the
	 * NonFueledTransportation object color the color of the transportation object
	 * weight the weight of the transportation object isOrganism indicates if the
	 * transportation is alive or not
	 */
	public NonFueledTransportation(String color, int weight, boolean isOrganism) {
		super(color, weight);
		this.isOrganism = isOrganism;
	}

	/**
	 * Getter method to retrieve the isOrganism property of the
	 * NonFueledTransportation object
	 * 
	 * @return the isOrganism property
	 */
	public boolean getIsOrganism() {
		return isOrganism;
	}
}
