package mentoring;

public class Car {
    private int speed;

    public Car(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return this.speed;
    }

    public boolean isMaxSpeed(int max) {
        return this.speed == max;
    }

}
