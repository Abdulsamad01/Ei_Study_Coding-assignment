public class CarRideHandler extends RideHandler {

    @Override
    public void handleRide(RideRequest request) {
        if (request.getPassengers() > 1 && request.getPassengers() <= 4) {
            System.out.println("Car assigned for up to 4 passengers.");
        } else if (nextHandler != null) {
            nextHandler.handleRide(request);
        }
    }
}
