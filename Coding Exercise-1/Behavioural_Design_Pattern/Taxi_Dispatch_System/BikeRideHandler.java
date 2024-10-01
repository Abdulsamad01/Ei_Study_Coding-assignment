public class BikeRideHandler extends RideHandler {

    @Override
    public void handleRide(RideRequest request) {
        if (request.getPassengers() == 1) {
            System.out.println("Bike assigned for 1 passenger.");
        } else if (nextHandler != null) {
            nextHandler.handleRide(request);
        }
    }
}
