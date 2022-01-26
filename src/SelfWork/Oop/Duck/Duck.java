package SelfWork.Oop.Duck;

public abstract class Duck {
    FlyBehaviour flyBehaviour;
    QuackBehaviour quackBehaviour;

    public void performQuack(){
        quackBehaviour.quack();
    }

    public void swim(){

    }

    public void display(){

    }

    public void performFly(){
        flyBehaviour.fly();
    }

}
