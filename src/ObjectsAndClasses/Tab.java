package ObjectsAndClasses;

public class Tab extends Computer {
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
}
