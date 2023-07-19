package study.racingcar.controller;

import static study.racingcar.model.Car.raceStart;
import static study.racingcar.view.InputView.getAttemptNumber;
import static study.racingcar.view.InputView.getCarNumber;

public class CarController {

    public CarController() {
        raceStart(getCarNumber(), getAttemptNumber());
    }
}
