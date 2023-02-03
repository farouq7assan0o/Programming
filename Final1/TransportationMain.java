package Final1;

import java.util.Scanner;

public class TransportationMain {
	public static void main(String[] args) {
		// Initialize a Scanner object for user input

		Scanner input = new Scanner(System.in);
		int transportationType;
		try {
			// Prompt the user to choose their transportation type

			System.out.println("Please choose your transportation type:");
			System.out.println("1. Non-Fueled Transportation");
			System.out.println("2. Fueled Transportation");
			transportationType = input.nextInt();
		} catch (Exception e) {
			transportationType = 4;
		}
		// Check the user's choice of transportation type
		if (transportationType == 1) {
			// If the user chose non-fueled transportation
			System.out.println("You have chosen Non-Fueled Transportation.");
			System.out.println("Please choose your mode of Non-Fueled Transportation:");
			System.out.println("1. Bike");
			System.out.println("2. Horse");
			int nonFueledTransportation = input.nextInt();

			// Check the user's choice of non-fueled transportation
			if (nonFueledTransportation == 1) {
				// If the user chose a bike
				System.out.println("You have chosen a bike.");
				// Create a Bike object
				Bike bike = new Bike("Blue", 25);
				// Display the color and whether it's an organism
				System.out.println("Color: " + bike.getColor());
				System.out.println("Weight: " + bike.getWeight());
				System.out.println("Is organism: " + bike.getIsOrganism());

			}

			else if (nonFueledTransportation == 2) {
				// If the user chose a horse
				System.out.println("You have chosen a horse.");
				// Create a Horse object
				Horse horse = new Horse("brown", 120);
				// Display the color and whether it's an organism
				System.out.println("Color: " + horse.getColor());
				System.out.println("Weight: " + horse.getWeight());
				System.out.println("Is organism: " + horse.getIsOrganism());
			}
		}

		else if (transportationType == 2) {
			// If the user chose fueled transportation
			System.out.println("You have chosen FueledTransportation.");
			System.out.println("Please choose your mode of FueledTransportation:");
			System.out.println("1. GoodsTransportation");
			System.out.println("2. PassengerTransportation");
			int fueledTransportation = input.nextInt();

			if (fueledTransportation == 1) {
				// If the user chose a Goods Transportation
				System.out.println("You have chosen GoodsTransportation.");
				System.out.println("Please choose your mode of GoodsTransportation:");
				System.out.println("1. Truck");
				int goodsTransportation = input.nextInt();

				if (goodsTransportation == 1) {
					// If the user chose a Truck

					System.out.println("You have chosen a truck.");
					// Create a Truck object
					Truck truck = new Truck("green", 2500, 500, 2000);
					// Display the color and Weigh, Fuel capacity and weigh of goods
					System.out.println("Color: " + truck.getColor());
					System.out.println("Weight: " + truck.getWeight());
					System.out.println("Fuel capacity: " + truck.getFuelCapacity());
					System.out.println("Weigh of goods: " + truck.getWeightOfGoods());
				} else {
					System.out.println("Invalid option.");
				}
			}

			else if (fueledTransportation == 2) {
				// If the user chose Passenger Transportation
				System.out.println("You have chosen PassengerTransportation.");
				System.out.println("Please choose your mode of PassengerTransportation:");
				System.out.println("1. Car");
				System.out.println("2. Bus");
				int passengerTransportation = input.nextInt();

				if (passengerTransportation == 1) {
					// If the user chose Car
					System.out.println("You have chosen a car.");
					// Create a Car object
					Car car = new Car("red", 1500, 40, 4);
					// Display the color and Weigh, Fuel capacity and Number of passengers
					System.out.println("Color: " + car.getColor());
					System.out.println("Weight: " + car.getWeight());
					System.out.println("Fuel capacity: " + car.getFuelCapacity());
					System.out.println("Number of passengers: " + car.getNumberOfPeople());
				}

				else if (passengerTransportation == 2) {
					// If the user chose Bus
					System.out.println("You have chosen a bus.");
					// Create a Bus object
					Bus bus = new Bus("Yellow", 500, 22, 30);
					// Display the color and Weigh, Fuel capacity and Number of passengers
					System.out.println("Color: " + bus.getColor());
					System.out.println("Weight: " + bus.getWeight());
					System.out.println("Fuel capacity: " + bus.getFuelCapacity());
					System.out.println("Number of passengers: " + bus.getNumberOfPeople());
				}
			}
		}
	}
}
