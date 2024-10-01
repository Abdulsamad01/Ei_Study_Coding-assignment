public class Main {
    public static void main(String[] args) {
        RideRequest request = new RideRequest(5);

        RideHandler bikeHandler = new BikeRideHandler();
        RideHandler carHandler = new CarRideHandler();
        RideHandler vanHandler = new VanRideHandler();

        bikeHandler.setNextHandler(carHandler);
        carHandler.setNextHandler(vanHandler);

        bikeHandler.handleRide(request);
    }
}
