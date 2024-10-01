public class RoomStatusCommand implements Command {
    private Room room;
    private int occupants;

    public RoomStatusCommand(Room room, int occupants) {
        this.room = room;
        this.occupants = occupants;
    }

    @Override
    public void execute() {
        room.addOccupants(occupants);
    }
}
