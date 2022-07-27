package kz.attractor.java.__MACOSX;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Car {
    private String carName;
    private int carNumber;

    private State state = State.WAY;


    public Car(String carName, int carNumber){
        this.carName = carName;
        this.carNumber = carNumber;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public int getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(int carNumber) {
        this.carNumber = carNumber;
    }
    public static List<Car> randomCarInParking() {
        String car = "Audi, Porshe, Zhiguli, Toyota, Honda, Genesis";
        List<Car> cars = new ArrayList<>();
        for (int i = 0; i < 200; i++) {

            cars.add(new Car(car.substring(new Random().nextInt(car.length())), i + 1));
        }
        return cars;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carName='" + carName + '\'' +
                ", carNumber=" + carNumber +
                ", state=" + state +
                '}';
    }
}
