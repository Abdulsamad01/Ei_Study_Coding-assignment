public class Main {
    public static void main(String[] args) {
        // Singleton: Office Manager
        OfficeManager officeManager = OfficeManager.getInstance();
        officeManager.configureRooms(3);

        // Get Room 1 and attach observers
        Room room1 = officeManager.getRoom(1);
        ACSystem acSystem = new ACSystem();
        LightingSystem lightingSystem = new LightingSystem();
        room1.addObserver(acSystem);
        room1.addObserver(lightingSystem);

        // Use Command Pattern for booking, cancelling, and status updates
        Command bookRoom = new BookRoomCommand(room1, 9, 60);
        Command cancelBooking = new CancelRoomCommand(room1);
        Command addOccupants = new RoomStatusCommand(room1, 2);

        // Execute commands
        bookRoom.execute();
        addOccupants.execute();
        cancelBooking.execute();
    }
}
