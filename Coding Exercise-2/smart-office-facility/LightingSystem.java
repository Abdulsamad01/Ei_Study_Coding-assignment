public class LightingSystem implements Observer {
    @Override
    public void update(boolean occupied) {
        if (occupied) {
            System.out.println("Lights turned ON.");
        } else {
            System.out.println("Lights turned OFF.");
        }
    }
}
