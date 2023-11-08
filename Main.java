package Test.Auto;
//Создать класс Car в пакете com.company.vehicles, Engine в пакете com.company.details и Driver в пакете com.company.professions.
//Класс Driver содержит поля - ФИО, стаж вождения.
//Класс Engine содержит поля - мощность, производитель.
//Класс Car содержит поля - марка автомобиля, класс автомобиля, вес, водитель типа Driver, мотор типа Engine.
// Методы start(), stop(), turnRight(), которые выводят на печать: "Поехали", "Останавливаемся", "Поворот направо" или "Поворот налево".
// А также метод toString(), который выводит полную информацию об автомобиле, ее водителе и моторе.
//Создать производный от Car класс  - Lorry (грузовик), характеризуемый также грузоподъемностью кузова.
//Создать производный от Car класс - SportCar, характеризуемый также предельной скоростью.
//Пусть класс Driver расширяет класс Person.

import Test.Driver;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("BMW","Sedan",1800);
        Engine engine = new Engine(3.2,"Germany");
        Driver driver = new Driver("Petrov V.V",4);
        Lorry lorry = new Lorry("Kamaz","",4500,2.500);
        SportCar sportCar = new SportCar("Tesla","Sedan",2500,420);
        Person person = new Person("Kozlov V V",3);

        System.out.println("Марка  автобомиля "+car.getModelCar()+" клас автобомиля " +car.getClasAuto()+
                " вес  "+car.getWeight()+" водитель "+driver.getName()+" мощность двигателя "+engine.getVolume() );
        car.start();
        car.stop();
        car.turnRight();



    }
}


