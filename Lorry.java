package CarParts;

public class Lorry extends Car{
    private double carryWeight;

    Lorry(String name, String type, Engine e, double carryWeight){
        this.name = name;
        this.type = type;
        this.engine = e;
        this.carryWeight = carryWeight;
    }

    @Override
    public void start() {
        System.out.println("Грузовик проехал");
    }

    @Override
    public void stop() {
        System.out.println("Грузовик остановился");
    }

    @Override
    public void printInfo() {
        System.out.println("Lorry: " + name +
                ", " + type + ", " + engine + ", weight: " + carryWeight);
    }


}
