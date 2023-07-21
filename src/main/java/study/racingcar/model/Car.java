package study.racingcar.model;

import java.util.List;
import java.util.Random;

public class Car {
    private static final int MAX_BOUNDARY_OF_RANDOM_NUMBER= 10;
    public Car() { }

    public static List<Integer> requestCarsToMove(int carNum, List<Integer> positions) {
        for (int i = 0; i < carNum; i++) {
            forwardNumber(i, positions);
        }
        return positions;
    }

    private static void forwardNumber(int current, List<Integer> positions) {
        Random random = new Random();
        int forward = random.nextInt(MAX_BOUNDARY_OF_RANDOM_NUMBER); // 0부터 9

        if (forward >= 4) {
            int currentValue = positions.get(current);
            int newValue = currentValue + 1;

            positions.set(current, newValue);
        }
    }
}
