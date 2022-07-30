package kz.attractor.java.__MACOSX;


import java.util.*;


public class Car {
    private String carName;
    private int carNumber;
    private int time;
    private int money;
    static String car;
    private State state = State.WAY;

    public Car(String carName, int carNumber){
        this.carName = carName;
        this.carNumber = carNumber;
        Car.car = "Honda, Bmw, Zhiguly";
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
    private void setMoney(int i) {
    }

    public void position(){
        if(new Random(25).nextInt() >= 3){
            state = State.PARKING;
        }
        if(new Random(25).nextInt() >= 3){
            state = State.WAY;
        }
    }

    public static List<Car> randomCarInParking() {
        List<Car> cars = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            cars.add(new Car(car.substring(new Random().nextInt(car.length())), i + 1));;
        }
        return cars;
    }

    public static void parkingProcess(){
        for(int i = 0; i < 30; i++){
            for(int j = 0; j < 60; j++){
                for(int k = 0; k < 24; k = k + 5){
                    for(Car cars : car){
                        car.
                    }
                }
            }
        }
    }
}
