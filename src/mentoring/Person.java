package mentoring;

public class Person {
    private static final int MAX_SPEED = 100;
    private Car car;
    private Output output;

    public Person(Car car, Output output) {
        this.car = car;
        this.output = output;
    }

    public String findMaxCarSpeed() {
        if (car.isMaxSpeed(MAX_SPEED)) {
            return output.printMax();
        }
        return output.noPrintMax();
    }

}