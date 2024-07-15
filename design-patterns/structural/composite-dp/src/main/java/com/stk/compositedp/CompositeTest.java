package com.stk.compositedp;

/*The Composite Design Pattern is a structural design pattern used in Java and other object-oriented
 programming languages. It allows you to compose objects into tree structures to represent part-whole
 hierarchies. This pattern lets clients treat individual objects and compositions of objects uniformly.

 Key Concepts
Component: An interface or abstract class that defines the common operations for both simple and complex objects.
Leaf: A class that represents a simple, indivisible object in the composition. Implements the Component interface.
Composite: A class that represents a complex object (a composition of Leaf and/or Composite objects).
    Implements the Component interface and provides methods to add, remove, and access child components.

How It Works:
Uniformity: Both individual objects (Leaf) and composite objects (Composite) implement the same interface (Component). This allows clients to interact with these objects without worrying about whether they are dealing with a single object or a collection of objects.
Recursive Composition: A Composite can contain other Composite objects, allowing for the creation of complex tree structures.*/
public class CompositeTest {
    public static void main(String[] args) {
        Component hd = new Leaf(1000, "hd");
        Component mouse = new Leaf(500, "mouse");
        Component monitor = new Leaf(5000, "monitor");
        Component ram = new Leaf(4000, "ram");
        Component cpu = new Leaf(12000, "cpu");

        Composite peripheral = new Composite("peripheral");
        Composite cabinet = new Composite("cabinet");
        Composite computer = new Composite("computer");
        Composite motherBoard = new Composite("motherBoard");

        motherBoard.addComponent(cpu);
        motherBoard.addComponent(ram);

        peripheral.addComponent(mouse);
        peripheral.addComponent(monitor);
        cabinet.addComponent(hd);
        cabinet.addComponent(motherBoard);

        computer.addComponent(cabinet);
        computer.addComponent(peripheral);

        computer.showPrice();
        /*output:
        * computer
        cabinet
        hd : 1000
        motherBoard
        cpu : 1000
        ram : 1000
        peripheral
        mouse : 1000
        monitor : 1000*/
    }
}


