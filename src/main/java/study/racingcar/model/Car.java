package study.racingcar.model;

import java.util.List;
import java.util.Random;

public class Car {
    private static final int MAX_BOUNDARY_OF_RANDOM_NUMBER= 10;
    private int positions;

    public Car(int positions) {
        this.positions = positions;
    }

    public static List<Car> requestCarsToMove(int carNum, List<Car> carList) {
        for (int i = 0; i < carNum; i++) {
            forwardNumber(i, carList);
        }
        return carList;
    }

    private static void forwardNumber(int current, List<Car> carList) {
        Random random = new Random();
        int forward = random.nextInt(MAX_BOUNDARY_OF_RANDOM_NUMBER); // 0부터 9

        if (forward >= 4) {
            Car car = carList.get(current);
            int currentValue = car.getPositions();

            car.setPositions(currentValue + 1);
            carList.set(current, car);
        }
    }

    public int getPositions() {
        return positions;
    }

    public void setPositions(int positions) {
        this.positions = positions;
    }
}
