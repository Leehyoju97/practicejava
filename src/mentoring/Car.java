package mentoring;

public class Car {
    private int speed = 100;

    public int getSpeed() {
        return this.speed;
    }

    public boolean isMaxSpeed(int max) {
        return this.speed == max;
    }
}
