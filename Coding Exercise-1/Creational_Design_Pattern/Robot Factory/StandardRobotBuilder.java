public class StandardRobotBuilder implements RobotBuilder {
    private Robot robot;

    public StandardRobotBuilder() {
        this.robot = new Robot();
    }

    @Override
    public void buildHead() {
        robot.setHead("Standard Head");
    }

    @Override
    public void buildArms() {
        robot.setArms("Standard Arms");
    }

    @Override
    public void buildLegs() {
        robot.setLegs("Standard Legs");
    }

    @Override
    public Robot getRobot() {
        return robot;
    }
}
