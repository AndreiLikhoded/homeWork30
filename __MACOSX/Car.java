package kz.attractor.java.__MACOSX;


import java.util.*;


public class Car {
    private String carName;
    private int carNumber;
    private int time;
    private int money;
    private State state = State.WAY;
 private static final Set<String> cars = Car.randomCarInParking();

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

   public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time){
        this.time = time;
    }

    public int getMoney() {
        return money;
    }

    public void position(){
        if(new Random(25).nextInt() >= 3){
            state = State.WAY;
        }
        if(new Random(25).nextInt() >= 3){
            state = State.PARKING;
        }
    }

    public static Set<String> randomCarInParking() {
        Set<String> cars = new TreeSet<>();
        for (int i = 0; i < 50; i++) {
            cars.add("Zhiguly");
            cars.add("Bmw");
            cars.add("Honda");
            cars.add("Toyota");
        }
        return cars;
    }

    private static void parkingSpace() {
        int space = 0;
        for (String car : cars) {
            if (space > 20) {
                car.
                continue;
            }
            if (car.getState() == State.PARKING) {
                space = space + 1;
            }
        }
    }
}
