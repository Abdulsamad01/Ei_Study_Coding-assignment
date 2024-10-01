public class VanRideHandler extends RideHandler {

    @Override
    public void handleRide(RideRequest request) {
        if (request.getPassengers() > 4) {
            System.out.println("Van assigned for more than 4 passengers.");
        } else if (nextHandler != null) {
            nextHandler.handleRide(request);
        }
    }
}
