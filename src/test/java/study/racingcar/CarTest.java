package study.racingcar;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static study.racingcar.controller.CarController.raceStart;
import static study.racingcar.model.Car.requestCarsToMove;

public class CarTest {

    private static final int MAX_BOUNDARY_OF_RANDOM_CAR_NUMBER = 5;
    private static final int MAX_BOUNDARY_OF_RANDOM_ATTEMPT_NUMBER = 3;
    @Test
    public void 자동차_이동_로직을_확인한다() {
        // given
        Random random = new Random();
        int carNum = random.nextInt(MAX_BOUNDARY_OF_RANDOM_CAR_NUMBER + 1); // 1 ~ 5
        int attemptNum = random.nextInt(MAX_BOUNDARY_OF_RANDOM_ATTEMPT_NUMBER + 3); // 3 ~ 5

        // when
        List<Integer> finalPositions = raceStart(carNum, attemptNum);

        // then
        assertEquals(carNum, finalPositions.size());
    }

    @Test
    public void 자동차_전진_로직을_확인한다() {
        // given
        Random random = new Random();
        int carNum = random.nextInt(MAX_BOUNDARY_OF_RANDOM_CAR_NUMBER + 1); // 1 ~ 5
        List<Integer> positions = new ArrayList<>();

        // when
        List<Integer> checkForward = requestCarsToMove(carNum, positions);

        // then
        for (int i = 0 ; i < carNum; i++) {
            assertEquals(checkForward.get(i) == 0 || checkForward.get(i) == 1, true);
        }
    }
}
