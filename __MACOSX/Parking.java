package kz.attractor.java.__MACOSX;

import java.util.Collections;
import java.util.List;

public class Parking {
    private static final List<Car> cars = Car.randomCarInParking();

    private static void parkingSpace() {
        int space = 0;
        Collections.shuffle(cars);
        for (Car car : cars) {
            if (space > 20) {
                car.setState(State.WAY);
                continue;
            }
            if (car.getState() == State.PARKING) {
                space = space + 1;
            }
        }
    }
}
