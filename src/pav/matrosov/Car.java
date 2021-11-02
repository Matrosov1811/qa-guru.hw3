package pav.matrosov;

public class Car {
    public final int wheels;
    public final String handdrive;

    public Car(int wheels, String handdrive) {
        this.wheels = wheels;
        this.handdrive = handdrive;
    }

    public int getWheels() {
        return wheels;
    }

    public String getHanddrive() {
        return handdrive;
    }
}
