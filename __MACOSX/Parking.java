package kz.attractor.java.__MACOSX;

import java.util.Collections;
import java.util.List;
import java.util.Set;

public class Parking {
    private static final Set<String> cars = Car.randomCarInParking();



    public static void parkingProcess(){
        Parking parking = new Parking();
        for(int i = 0; i < 30; i++){
            for(int j = 0; j < 60; j++){
                for(int k = 0; k < 24; k = k + 5){
                    for(String car : cars){

                    }
                }
            }
        }
    }
}
