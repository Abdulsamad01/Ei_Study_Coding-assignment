# Ei_Study_Coding-assignment

# Smart Office Facility & Design Patterns - Coding Assignment

This repository contains solutions for two exercises focusing on design patterns, OOP principles, and efficient code implementation in a smart office facility system and various design pattern implementations.

---

## Exercise 1: Design Pattern Demonstration

This part of the project demonstrates the use of **Behavioral**, **Creational**, and **Structural** design patterns. The project includes six different use cases, demonstrating two patterns from each category.

### **Design Patterns Demonstrated:**
1. **Behavioral Design Patterns**:
    - **Chain of Responsibility**: Taxi Dispatch System
    - **Iterator**: Music Player Playlist

2. **Creational Design Patterns**:
    - **Abstract Factory**: Online Form Generator
    - **Builder**: Robot Factory

3. **Structural Design Patterns**:
    - **Decorator**: Web Page Rendering with Header and Footer
    - **Proxy**: Bank Account Access through Proxy

### **How to Run**:
1. Navigate to the **Exercise1** directory:
   ```bash
   cd Exercise1
2. Compile all files:
   ```bash
   javac *.java
3. Run the Main.java file for each pattern example:
   ```bash
   java Main



# Exercise 2: Smart Office Facility System

This part of the project implements a **console-based smart office facility system** that manages conference room bookings, occupancy detection, and automation of air conditioning and lighting based on room occupancy. The system adheres to best practices like design patterns and SOLID principles.

---

## Design Patterns Used:
1. **Singleton Pattern**: Manages the global state of the office configuration.
2. **Observer Pattern**: Sensors like AC and lighting systems are notified of room occupancy changes.
3. **Command Pattern**: Handles booking, cancellation, and room status updates through commands for flexibility and scalability.

---

## Features:
- Configure the number of meeting rooms.
- Book and cancel room bookings.
- Automatic control of AC and lighting based on occupancy.
- Booking releases if the room is unoccupied for more than 5 minutes.

---

## How to Run:
1. Navigate to the **Exercise2** directory:
   ```bash
   cd Exercise2
2. Compile all files:
   ```bash
   javac *.java
3. Compile all files:
   ```bash
   java Main


Possible Input/Output:
Console Input	Output
Config room count 3	"Office configured with 3 meeting rooms: Room 1, Room 2, Room 3."
Config room max capacity 1 10	"Room 1 maximum capacity set to 10."
Add occupant 1 2	"Room 1 is now occupied by 2 persons. AC and lights turned on."
Block room 1 09:00 60	"Room 1 booked from 09:00 for 60 minutes."
Cancel room 1	"Booking for Room 1 cancelled successfully."

Error Cases:
Console Input	Output
Block room 1 09:00 60 (already booked)	"Room 1 is already booked during this time. Cannot book."
Cancel room 2 (not booked)	"Room 2 is not booked. Cannot cancel booking."
Add occupant 2 1	"Room 2 occupancy insufficient to mark as occupied."
Add occupant 4 2 (non-existent room)	"Room 4 does not exist."
Block room A 09:00 60 (invalid room)	"Invalid room number. Please enter a valid room number."
Config room max capacity 1 -5	"Invalid capacity. Please enter a valid positive number."
Room status 1 (unoccupied > 5 mins)	"Room 1 is now unoccupied. Booking released. AC and lights off."


Tech Stack:
Language: Java
Design Patterns: Singleton, Observer, Command.
OOP Principles: SOLID, Encapsulation, Abstraction, Polymorphism.

Project Structure:
.
├── ACSystem.java
├── BookRoomCommand.java
├── CancelRoomCommand.java
├── Command.java
├── LightingSystem.java
├── Main.java
├── OfficeManager.java
├── Observer.java
├── Room.java
└── RoomStatusCommand.java

License:
This project is licensed under the MIT License. Feel free to use and modify the code as per your requirements.


