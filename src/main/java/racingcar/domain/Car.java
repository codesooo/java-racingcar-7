package racingcar.domain;

public class Car {
    private String name;
    private int forwardCount;

    public Car(String name) {
        this.name = name;
        forwardCount = 0;
    }

    public String getCarName() {
        return name;
    }

    public int getForwardCount() {
        return forwardCount;
    }

    public void moveForward() {
        forwardCount++;
    }
}
