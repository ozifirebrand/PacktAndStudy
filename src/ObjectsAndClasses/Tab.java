package ObjectsAndClasses;

public class Tab extends Computer implements ComputerType {
    private double screenSize;

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }
    public void whatIsIt(){
        System.out.println("It is a tablet!");
    }

    @Override
    public String getDeviceType() {
        return "It is a Tablet!";
    }

    @Override
    public String getSpeed() {
        return "1GHz";
    }
}
