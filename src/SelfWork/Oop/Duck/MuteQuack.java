package SelfWork.Oop.Duck;

public class MuteQuack implements QuackBehaviour{
    @Override
    public void quack() {
        System.out.println("Scream with your ultrasonic sound");
    }
}
