package CarParts;

public abstract class Car {
    String name;
    String type;
    Engine engine;

    public abstract void start();
    public abstract void stop();

    public void turnRight(){
        System.out.println("Поворот направо");
    }

    public void turnLeft(){
        System.out.println("Поворот налево");
    }

    public abstract void printInfo();
}
