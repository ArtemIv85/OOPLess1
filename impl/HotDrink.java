package less1.practice.impl;

import less1.practice.Product;

import java.time.LocalDate;

public class HotDrink extends Product {
    private float volume;
    private int temperature;


    public HotDrink(String name, double price, LocalDate releaseDate, float volume, int temperature) {
        super(name, price, releaseDate);
        this.volume = volume;
        this.temperature = temperature;
    }

    public float getVolume() {
        return volume;
    }

    public int getTemperature() {
        return temperature;
    }





    @Override
    public String toString() {
        return "HotDrink{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", releaseDate=" + releaseDate +
                ", volume=" + volume +
                ", temperature=" + temperature +
                '}';
    }
}
