package study.racingcar.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static study.racingcar.view.ResultView.printRaceResult;

public class Car {

    private static final int MAX_BOUNDARY_OF_RANDOM_NUMBER= 10;
    public Car(int carNum, List<Integer> positions) {
        addCar(carNum, positions);
    }

    public static void raceStart(int carNum, int attemptNum) {
        List<Integer> positions = new ArrayList<>();

        Car car = new Car(carNum, positions);

        car.addCar(carNum, positions);

        for (int i = 0; i < attemptNum; i++) {
            car.requestCarsToMove(carNum, positions);
            printRaceResult(positions);
        }
    }

    private static void addCar(int carNum, List<Integer> positions) {
        for (int i = 0; i < carNum; i++) {
            positions.add(i,0);
        }
    }

    public static void requestCarsToMove(int carNum, List<Integer> positions) {
        for (int i = 0; i < carNum; i++) {
            forwardNumber(i, positions);
        }
    }

    private static void forwardNumber(int current, List<Integer> positions) {
        Random random = new Random();
        int forward = random.nextInt(MAX_BOUNDARY_OF_RANDOM_NUMBER); // 0부터 9

        if (forward >= 4) { // 전진하는 조건
            int currentValue = positions.get(current);
            int newValue = currentValue + 1;

            positions.set(current, newValue);
        }
    }
}
