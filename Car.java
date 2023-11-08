package Test.Auto;
//Класс Car содержит поля - марка автомобиля, класс автомобиля, вес, водитель типа Driver, мотор типа Engine.
// Методы start(), stop(), turnRight(),  которые выводят на печать: "Поехали", "Останавливаемся", "Поворот направо" или "Поворот налево".
public class Car {
    private String modelCar;
    private String clasAuto ;
    private int weight ;

    public Car(String modelCar, String clasAuto, int weight) {
        this.modelCar = modelCar;
        this.clasAuto = clasAuto;
        this.weight = weight;
    }

    public String getModelCar() {
        return modelCar;
    }

    public void setModelCar(String modelCar) {
        this.modelCar = modelCar;
    }

    public String getClasAuto() {
        return clasAuto;
    }

    public void setClasAuto(String clasAuto) {
        this.clasAuto = clasAuto;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }
    public void  start (){
        System.out.println("Машина  едет");
    }
    public void  stop (){
        System.out.println("Машина  остановилась");
    }
    public void  turnRight (){
        System.out.println("Машина повернула  на право");
    }


    @Override
    public String toString() {
        return "Car{" +
                "modelCar='" + modelCar + '\'' +
                ", clasAuto='" + clasAuto + '\'' +
                '}';
    }
}
