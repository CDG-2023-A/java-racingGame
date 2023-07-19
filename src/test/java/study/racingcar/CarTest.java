package study.racingcar;

import org.junit.jupiter.api.Test;
import study.racingcar.model.Car;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarTest {

    private static final int POSITIONS_INDEX = 0;
    @Test
    public void 자동차_대수와_시도_횟수를_1로_정해준_뒤_이동_로직을_확인한다() {
        int carNum = 1;
        int attemptNum = 1;
        List<Integer> positions = new ArrayList<>();

        Car car = new Car(carNum, positions);
        car.raceStart(carNum, attemptNum);

        int carPosition = 0;

        for (int i = 0; i < positions.size(); i++) {
            carPosition = positions.get(i);
        }

        assertEquals(carPosition >= 0 && carPosition <= 1, true);
    }

    @Test
    public void 자동차_대수를_1대로_정해준_뒤_전진_로직을_확인한다() {
        int carNum = 1;
        List<Integer> positions = new ArrayList<>();

        Car car = new Car(carNum, positions);
        car.requestCarsToMove(carNum, positions);

        int carPosition = positions.get(POSITIONS_INDEX);

        assertEquals(carPosition == 0 || carPosition == 1, true);
    }
}
