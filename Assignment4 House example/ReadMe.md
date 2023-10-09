# Composite Design Pattern Example in Java

This Java program demonstrates the Composite Design Pattern using an example of a building composed of generic housing structures. The Composite Design Pattern allows you to compose objects into tree structures to represent part-whole hierarchies.

In this example, we create housing structures such as walls, rooms, floors, and a building. We build a hierarchical structure of these housing elements to represent a building.

## Structure

The program includes the following classes:

- `HousingStructure`: An interface defining the common operations for housing structures, including displaying, getting area, and getting cost.

- `Wall`: A leaf class representing a wall with area and cost attributes.

- `Room`: A composite class representing a room that can contain walls.

- `Floor`: A composite class representing a floor that can contain rooms.

- `Building`: The main composite class representing the building, which can contain floors.
