package mentoring;

public class Person {
    private static final int MAX_SPEED = 100;
    private Car car;

    public Person(Car car) {
        this.car = car;
    }

    public boolean isMaxCarSpeed() {
        if (car.isMaxSpeed(MAX_SPEED)) {
            return true;
        }
        return false;
    }

}
