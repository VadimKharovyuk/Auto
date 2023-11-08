package Test.Auto;
//Класс Engine содержит поля - мощность, производитель.
public class Engine {
    private double volume;
    private String nameIn;

    public Engine(double volume, String nameIn) {
        this.volume = volume;
        this.nameIn = nameIn;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public String getNameIn() {
        return nameIn;
    }

    public void setNameIn(String nameIn) {
        this.nameIn = nameIn;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "volume=" + volume +
                ", nameIn='" + nameIn + '\'' +
                '}';
    }
}
