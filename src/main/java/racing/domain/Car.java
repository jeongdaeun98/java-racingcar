package racing.domain;

public class Car {

    private int distance;

    public void move() {
        distance++;
    }

    public int getMovedDistance() {
        return distance;
    }
}