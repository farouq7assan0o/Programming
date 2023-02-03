package Final1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//The MainFrame class extends JFrame and implements ActionListener

public class TransportationEventDriven extends JFrame implements ActionListener {

	// Define buttons for each type of transportation
	private JButton fuelButton = new JButton("Transportation that needs fuel");
	private JButton noFuelButton = new JButton("Transportation that doesn't need fuel");
	private JButton goodsButton = new JButton("Goods Transportation");
	private JButton passengersButton = new JButton("Passengers Transportation");
	private JButton truckButton = new JButton("Truck");
	private JButton carButton = new JButton("Car");
	private JButton busButton = new JButton("Bus");
	private JButton bikeButton = new JButton("Bike");
	private JButton horseButton = new JButton("Horse");

	// The MainFrame constructor sets the layout, adds buttons to the frame,
	// registers action listeners, sets frame properties, and makes it visible
	public TransportationEventDriven() {
		// Set the layout of the frame to FlowLayout
		setLayout(new FlowLayout());

		// Add the fuel and noFuel buttons to the frame
		add(fuelButton);
		add(noFuelButton);

		// Register action listeners for the buttons
		fuelButton.addActionListener(this);
		noFuelButton.addActionListener(this);

		// Set the title, size, default close operation, and visibility of the frame
		setTitle("Transportation");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	// The actionPerformed method determines which button was pressed and shows a
	// corresponding message
//Override
	public void actionPerformed(ActionEvent e) {
		// Determine which button was pressed
		// If the fuelButton was pressed

		if (e.getSource() == fuelButton) {
			// Show a message for "transportation that needs fuel"

			JOptionPane.showMessageDialog(this, "You selected transportation that needs fuel");

			// Remove the fuel and noFuel buttons
			remove(fuelButton);
			remove(noFuelButton);

			// Add the goods and passengers buttons
			add(goodsButton);
			add(passengersButton);

			// Register action listeners for the buttons
			goodsButton.addActionListener(this);
			passengersButton.addActionListener(this);

			// Update the frame
			validate();
			repaint();

		} else if (e.getSource() == noFuelButton) {
			// Show a message for "transportation that doesn't need fuel"
			JOptionPane.showMessageDialog(this, "You selected transportation that doesn't need fuel");

			// Remove the fuel and noFuel buttons
			remove(fuelButton);
			remove(noFuelButton);

			// Add the bike and horse buttons
			add(bikeButton);
			add(horseButton);

			// Register action listeners for the buttons
			bikeButton.addActionListener(this);
			horseButton.addActionListener(this);

			// Update the frame
			validate();
			repaint();

		}

		if (e.getSource() == bikeButton) {
			// Show a message for "You have selected Bike"
			String bikeColor = "Blue";
			int bikeWeight = 25;
			boolean bikeIsOrganism = false;
			JOptionPane.showMessageDialog(this, "You have chosen Bike\n " + "Color: " + bikeColor + "\n weight: "
					+ bikeWeight + "\n Is organism: " + bikeIsOrganism);
		}

		if (e.getSource() == horseButton) {
			// Show a message for "You have selected Horse"
			int horseWeight = 120;
			String horseColor = "Brown";
			boolean horseIsOrganism = true;
			JOptionPane.showMessageDialog(this, "You have chosen Horse\n" + "Color: " + horseColor + "\n Weight: "
					+ horseWeight + "\n Is organism: " + horseIsOrganism);
		}

		else if (e.getSource() == goodsButton) {

			JOptionPane.showMessageDialog(this, "You selected Goods transportation");

			// Remove the goods and passengers buttons
			remove(goodsButton);
			remove(passengersButton);

			// Add the truck button
			add(truckButton);

			// Register an action listener for the button
			truckButton.addActionListener(this);

			// Update the frame
			validate();
			repaint();
		}

		if (e.getSource() == truckButton) {
			// Show a message for "You have selected Truck"

			int truckWeight = 2500;
			String truckColor = "green";
			int truckfuelCapacity = 500;
			int weightOfGoods = 2000;

			JOptionPane.showMessageDialog(this, "You have chosen Truck\n" + "Color: " + truckColor + "\n Weight: "
					+ truckWeight + "\n Fuel capacity: " + truckfuelCapacity + "\n Weigh of goods: " + weightOfGoods);
		}

		else if (e.getSource() == passengersButton) {

			// Show a message for "You have selected passengers transportation"
			JOptionPane.showMessageDialog(this, "You have selected passengers transportation");

			// Remove the goods and passengers buttons
			remove(goodsButton);
			remove(passengersButton);

			// Add the car and bus buttons
			add(carButton);
			add(busButton);

			carButton.addActionListener(this);
			busButton.addActionListener(this);

			// Update the frame
			validate();
			repaint();
		}

		if (e.getSource() == carButton) {
			// Show a message for "You have selected Car" and its info
			String carColor = "red";
			int carWeight = 1500;
			int carFuelCapacity = 40;
			int carNumberOfPeople = 4;
			JOptionPane.showMessageDialog(this,
					"You have chosen Car\n" + "Color: " + carColor + "\n Weight: " + carWeight + "\n Fuel capacity: "
							+ carFuelCapacity + "\n Number of passengers: " + carNumberOfPeople);
		}

		if (e.getSource() == busButton) {
			// Show a message for "You have selected Bus"

			String busColor = "Yellow";
			int busWeight = 500;
			int busFuelCapacity = 30;
			int busNumberOfPeople = 22;
			JOptionPane.showMessageDialog(this,
					"You have chosen Bus\n" + "Color: " + busColor + "\n Weight: " + busWeight + "\n Fuel capacity: "
							+ busFuelCapacity + "\n Number of passengers: " + busNumberOfPeople);
		}
	}

	public static void main(String[] args) {
		new TransportationEventDriven();
	}
}