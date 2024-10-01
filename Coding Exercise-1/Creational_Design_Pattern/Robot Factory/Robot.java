public class Robot {
    private String head;
    private String arms;
    private String legs;

    public void setHead(String head) {
        this.head = head;
    }

    public void setArms(String arms) {
        this.arms = arms;
    }

    public void setLegs(String legs) {
        this.legs = legs;
    }

    public void showDetails() {
        System.out.println("Robot with " + head + ", " + arms + ", " + legs);
    }
}
