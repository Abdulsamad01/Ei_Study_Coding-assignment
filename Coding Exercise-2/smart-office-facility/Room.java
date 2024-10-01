import java.util.ArrayList;
import java.util.List;

public class Room {
    private int id;
    private int maxCapacity;
    private int occupants;
    private boolean booked;
    private boolean occupied;
    private List<Observer> observers;

    public Room(int id) {
        this.id = id;
        this.maxCapacity = 10; // Default capacity
        this.occupants = 0;
        this.booked = false;
        this.occupied = false;
        observers = new ArrayList<>();
    }

    public void setMaxCapacity(int capacity) {
        this.maxCapacity = capacity;
        System.out.println("Room " + id + " maximum capacity set to " + capacity + ".");
    }

    public void addOccupants(int occupants) {
        this.occupants = occupants;
        if (occupants >= 2) {
            this.occupied = true;
            notifyObservers();
            System.out.println("Room " + id + " is now occupied by " + occupants + " persons. AC and lights turned on.");
        } else {
            this.occupied = false;
            notifyObservers();
            System.out.println("Room " + id + " is now unoccupied. AC and lights turned off.");
        }
    }

    public void bookRoom(int time, int duration) {
        if (!booked) {
            this.booked = true;
            System.out.println("Room " + id + " booked from " + time + " for " + duration + " minutes.");
        } else {
            System.out.println("Room " + id + " is already booked during this time. Cannot book.");
        }
    }

    public void cancelBooking() {
        if (booked) {
            this.booked = false;
            System.out.println("Booking for Room " + id + " cancelled successfully.");
        } else {
            System.out.println("Room " + id + " is not booked. Cannot cancel booking.");
        }
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(occupied);
        }
    }
}
