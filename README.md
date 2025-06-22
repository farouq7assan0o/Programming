# Java Transportation System Project

## Overview

This project demonstrates the implementation of three programming paradigms in Java: Procedural, Object-Oriented, and Event-Driven. The system simulates various types of transportation such as bikes, horses, cars, buses, and trucks. It highlights the use of inheritance, encapsulation, polymorphism, and GUI-based interaction through event-driven design.

## Features

### Procedural Implementation
- Demonstrates a step-by-step approach to simulate transportation logic
- Implemented in TransportationProcedural.java

### Object-Oriented Implementation
- Class hierarchy representing real-world transportation types
- Uses inheritance, encapsulation, and polymorphism
- Demonstrates code reuse, modularity, and maintainability
- Key classes include:
  - Transportation.java (base class)
  - FueledTransportation.java, NonFueledTransportation.java
  - Car.java, Bus.java, Truck.java, Bike.java, Horse.java

### Event-Driven Implementation
- GUI developed using Java Swing
- Allows users to interactively select and view transportation types
- Implemented in TransportationEventDriven.java

## Class Overview

| Class                       | Description                                      |
|----------------------------|--------------------------------------------------|
| Transportation             | Abstract base class for all types               |
| FueledTransportation       | Base class for vehicles that use fuel           |
| NonFueledTransportation    | Base class for manual or animal-driven transport|
| PassengerTransportation    | Base for transporting people                    |
| GoodsTransportation        | Base for transporting cargo                    |
| Car, Bus, Truck            | Specific fueled transportation implementations  |
| Bike, Horse                | Specific non-fueled transportation classes      |
| TransportationMain         | Runs the object-oriented implementation         |
| TransportationProcedural   | Runs the procedural approach                    |
| TransportationEventDriven  | GUI-based implementation using buttons          |
| Final, Team                | Controller or utility classes used in other parts|

## How to Run

1. Compile all Java files using:
   javac *.java

2. Run the main class of the desired approach:

   To run the procedural version:
   java TransportationProcedural

   To run the object-oriented version:
   java TransportationMain

   To run the event-driven GUI:
   java TransportationEventDriven

## Learning Outcomes

This project helped develop practical understanding of:

- Programming paradigms and when to apply each
- Structuring object-oriented systems with inheritance and composition
- Creating responsive GUIs using Java Swing
- Using encapsulation and polymorphism in code design
- Managing and debugging projects through an IDE
- Writing clean, readable, and modular Java code

## Tools and Technologies

- Java SE
- Java Swing for GUI
- IntelliJ IDEA or NetBeans for development
- Command-line for compilation and testing

## Author

Farouq Hassan  
Fall 2022  
HTU – Programming Final  
Instructor: Dr. Mariam Biltawi
