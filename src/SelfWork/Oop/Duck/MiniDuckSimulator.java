package SelfWork.Oop.Duck;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();
        System.out.println();
        Duck model = new ModelDuck();
        model.performFly();
        System.out.println();
        model.setFlyBehaviour(new FlyRocketPowered());
        model.performFly();
    }
}
