public abstract class RideHandler {
    protected RideHandler nextHandler;

    public void setNextHandler(RideHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void handleRide(RideRequest request);
}
