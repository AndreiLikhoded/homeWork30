package kz.attractor.java.__MACOSX;


import java.text.DecimalFormat;
import java.util.*;

public class Car {
    private String carName;

    private int time;
    private int money;
    private State state;

    private static final Set<Car> cars = Car.randomCarInParking();

    public Car(String carName, State state){
        this.carName = carName;
        this.state = state;

    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
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

    public static void parkingProcess() {
        for (int i = 0; i < 30; i++) {
            for (int j = 0; j < 60; j++) {
                for (int k = 0; k < 24; k = k + 5) {
                    for (Car car : cars) {
                        car.position();
                    }
                }
            }
        }
    }

    public static Set<Car> randomCarInParking() {
        Set<Car> cars = new TreeSet<>();
        while(cars.size() != 200){
            cars.add(new Car(Car.carNumber(), State.WAY));
        }
        return cars;
    }

    public static String carNumber(){
        StringBuffer carNumber = new StringBuffer();
        carNumber.append(randomNumber());

        return String.valueOf(carNumber);
    }

    private static String randomNumber(){
        DecimalFormat df = new DecimalFormat("00");
        int number = new Random().nextInt(100);

        return df.format(number);
    }

}
