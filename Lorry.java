package Test.Auto;
//Создать производный от Car класс  - Lorry (грузовик), характеризуемый также грузоподъемностью кузова.
public class Lorry extends Car{
    private double kuzovUp ;

    public Lorry(String modelCar, String clasAuto, int weight, double kuzovUp) {
        super(modelCar, clasAuto, weight);
        this.kuzovUp = kuzovUp;
    }
}
