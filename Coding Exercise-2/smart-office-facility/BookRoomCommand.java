public class BookRoomCommand implements Command {
    private Room room;
    private int time;
    private int duration;

    public BookRoomCommand(Room room, int time, int duration) {
        this.room = room;
        this.time = time;
        this.duration = duration;
    }

    @Override
    public void execute() {
        room.bookRoom(time, duration);
    }
}
