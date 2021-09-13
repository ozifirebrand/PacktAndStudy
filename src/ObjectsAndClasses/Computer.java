package ObjectsAndClasses;

public class Computer {
    private int cpuSpeed;

    public void whatIsIt(){
        System.out.println("It is a PC!");
    }

    public int getCpuSpeed() {
        return cpuSpeed;
    }

    public void setCpuSpeed(int cpuSpeed) {
        this.cpuSpeed = cpuSpeed;
    }
}
