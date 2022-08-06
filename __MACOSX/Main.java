package kz.attractor.java.__MACOSX;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    private static final Set<Car> cars = Car.randomCarInParking();


    public static void main(String[] args){
        run();
    }
    public static void run(){
        System.out.println(cars);
    }
}
