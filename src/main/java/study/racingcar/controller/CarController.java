package study.racingcar.controller;

import study.racingcar.model.Car;
import study.racingcar.view.InputView;
import study.racingcar.view.ResultView;

import java.util.ArrayList;
import java.util.List;

import static study.racingcar.model.Car.requestCarsToMove;

public class CarController {
    public CarController() {
        List<Car> carList = addCar(InputView.getCarNumber());
        raceStart(InputView.getCarNumber(), InputView.getAttemptNumber(), carList);
    }

    public static void raceStart(int carNum, int attemptNum, List<Car> carList) {
        for (int i = 0; i < attemptNum; i++) {
            List<Car> racingCar = requestCarsToMove(carNum, carList);
            ResultView.printRaceResult(racingCar);
        }
    }

    public static List<Car> addCar(int carNum) {
        List<Car> carList = new ArrayList<>();

        for (int i = 0; i < carNum; i++) {
            Car car = new Car(0);

            carList.add(i, car);
        }

        return carList;
    }
}
