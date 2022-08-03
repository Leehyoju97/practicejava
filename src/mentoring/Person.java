package mentoring;

public class Person {
    private static final int MAX_SPEED = 100;
    Car car = new Car();

    public String findMaxCarSpeed() {
        if (car.isMaxSpeed(MAX_SPEED)) {
            return printMax();
        }
        return noPrintMax();
    }

    private String printMax() {
        return "MAX!!!";
    }

    private String noPrintMax() {
        return "NO MAX!!!";
    }
}
