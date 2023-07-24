// Создаем класс насследования. Наследование - расширение, то есть берется все из родительского класаа и дополняется
package Lessons01.Seminar.Product;

public class Bottle extends Product { // Создалия класс наследования 
    private double volume; // добавили поле,

    public Bottle(String name, double price, double volume) {
        super(name, price); // конструктор родительского класса
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return super.toString() + ", volume: " + volume + "л.";
    }
}
