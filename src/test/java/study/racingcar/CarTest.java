package study.racingcar;

import org.junit.jupiter.api.Test;
import study.racingcar.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static study.racingcar.controller.CarController.addCar;
import static study.racingcar.model.Car.requestCarsToMove;

public class CarTest {

    private static final int MAX_BOUNDARY_OF_RANDOM_CAR_NUMBER = 5;
    @Test
    public void 자동차_전진_로직을_확인한다() {
        // given
        Random random = new Random();
        int carNum = random.nextInt(MAX_BOUNDARY_OF_RANDOM_CAR_NUMBER + 1); // 1 ~ 5
        List<Car> carList = addCar(carNum);

        // when
        List<Car> checkForward = requestCarsToMove(carNum, carList);

        // then
        for (int i = 0 ; i < carNum; i++) {
            assertEquals(checkForward.get(i).getPositions() == 0 || checkForward.get(i).getPositions() == 1, true);
        }
    }
}
