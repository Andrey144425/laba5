package CarParts;

public class Engine {
    double power;
    String creator;

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public String getCreator() {
        return creator;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "power=" + power +
                ", creator='" + creator + '\'' +
                '}';
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public Engine(double power, String creator) {
        this.power = power;
        this.creator = creator;
    }


}
