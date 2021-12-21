package CarParts;

public class SportCar extends Car{
    private double maxSpeed;

    SportCar(String name, String type, Engine e, double speed){
        this.name = name;
        this.type = type;
        this.engine = e;
        this.maxSpeed = speed;
    }

    @Override
    public void start() {
        System.out.println("SportCar проехал");
    }

    @Override
    public void stop() {
        System.out.println("SportCar остановился");
    }

    @Override
    public void printInfo() {
        System.out.println("Lorry: " + name +
                ", " + type + ", " + engine + ", maxSpeed: " + maxSpeed);
    }


}
