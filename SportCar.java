package Test.Auto;

public class SportCar extends Car{
    private int maxSpeed;
    public SportCar(String modelCar, String clasAuto, int weight, int maxSpeed) {
        super(modelCar, clasAuto, weight);
        this.maxSpeed = maxSpeed;
    }
}
