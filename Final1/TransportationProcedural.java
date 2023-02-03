package Final1;

import java.util.Scanner;

public class TransportationProcedural {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// Prompt the user to choose their transportation type

		System.out.println("Please choose your transportation type:");
		System.out.println("1. Non-Fueled Transportation");
		System.out.println("2. Fueled Transportation");
		int transportationType = input.nextInt();

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
				int bikeWeight = 25;
				String bikeColor = "Blue";
				boolean bikeIsOrganism = false;

				System.out.println("Color: " + bikeColor);
				System.out.println("Weight: " + bikeWeight);
				System.out.println("Is organism: " + bikeIsOrganism);
			} else if (nonFueledTransportation == 2) {
				// If the user chose a horse
				System.out.println("You have chosen a horse.");
				int horseWeight = 120;
				String horseColor = "Brown";
				boolean horseIsOrganism = true;

				System.out.println("Color: " + horseColor);
				System.out.println("Weight: " + horseWeight);
				System.out.println("Is organism: " + horseIsOrganism);

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
					int truckWeight = 2500;
					String truckColor = "green";
					int truckfuelCapacity = 500;
					int weightOfGoods = 2000;

					// Display the color and Weigh, Fuel capacity and weigh of goods
					System.out.println("Color: " + truckColor);
					System.out.println("Weight: " + truckWeight);
					System.out.println("Fuel capacity: " + truckfuelCapacity);
					System.out.println("Weigh of goods: " + weightOfGoods);
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
					String carColor = "red";
					int carWeight = 1500;
					int carFuelCapacity = 40;
					int carNumberOfPeople = 4;

					System.out.println("Color: " + carColor);
					System.out.println("Weight: " + carWeight);
					System.out.println("Fuel capacity: " + carFuelCapacity);
					System.out.println("Number of passengers: " + carNumberOfPeople);
				} else if (passengerTransportation == 2) {
					// If the user chose Bus
					System.out.println("You have chosen a bus.");
					String busColor = "Yellow";
					int busWeight = 500;
					int busFuelCapacity = 30;
					int busNumberOfPeople = 22;

					System.out.println("Color: " + busColor);
					System.out.println("Weight: " + busWeight);
					System.out.println("Fuel capacity: " + busFuelCapacity);
					System.out.println("Number of passengers: " + busNumberOfPeople);

				} else {
					System.out.println("Invalid option.");
				}
			}
		}
	}
}