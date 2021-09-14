package ObjectsAndClasses;

public class ComputerMain {
    public static void main(String[] args) {
        Tab tablet = new Tab();
        tablet.setCpuSpeed(25);
        System.out.println(tablet.getCpuSpeed());
        System.out.println(tablet.getSpeed());
        System.out.println(tablet.getDeviceType());
        tablet.whatIsIt();
        Computer myTab = new Tab();
        myTab.whatIsIt();
    }
}
