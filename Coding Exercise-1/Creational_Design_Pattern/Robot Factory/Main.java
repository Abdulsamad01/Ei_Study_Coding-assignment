public class Main {
    public static void main(String[] args) {
        RobotBuilder builder = new StandardRobotBuilder();
        builder.buildHead();
        builder.buildArms();
        builder.buildLegs();
        
        Robot robot = builder.getRobot();
        robot.showDetails();
    }
}
