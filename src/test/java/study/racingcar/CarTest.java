package study.racingcar;

import org.junit.jupiter.api.Test;
import study.racingcar.controller.CarController;

public class CarTest {
    @Test
    public void 자동차_이동_로직을_확인한다() {
        CarController.racingCar(1, 1);

    }
}
