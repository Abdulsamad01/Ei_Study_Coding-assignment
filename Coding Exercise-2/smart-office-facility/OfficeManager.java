import java.util.HashMap;
import java.util.Map;

public class OfficeManager {
    private static OfficeManager instance;
    private Map<Integer, Room> rooms = new HashMap<>();

    // Private constructor to prevent instantiation
    private OfficeManager() {}

    public static OfficeManager getInstance() {
        if (instance == null) {
            instance = new OfficeManager();
        }
        return instance;
    }

    public void configureRooms(int roomCount) {
        for (int i = 1; i <= roomCount; i++) {
            rooms.put(i, new Room(i));
        }
        System.out.println("Office configured with " + roomCount + " meeting rooms.");
    }

    public Room getRoom(int roomId) {
        return rooms.get(roomId);
    }
}
