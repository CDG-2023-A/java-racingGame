package study.racingcar.controller;

import study.racingcar.view.InputView;
import study.racingcar.view.ResultView;

import java.util.ArrayList;
import java.util.List;

import static study.racingcar.model.Car.requestCarsToMove;

public class CarController {
    public CarController() {
        raceStart(InputView.getCarNumber(), InputView.getAttemptNumber());
    }

    public static List<Integer> raceStart(int carNum, int attemptNum) {
        List<Integer> startLine = addCar(carNum);
        List<Integer> finalPositions = new ArrayList<>();

        for (int i = 0; i < attemptNum; i++) {
            List<Integer> racingCar = requestCarsToMove(carNum, startLine);
            ResultView.printRaceResult(racingCar);
            System.out.println("");
            finalPositions = new ArrayList<>(racingCar);
        }
        return finalPositions;
    }

    private static List<Integer> addCar(int carNum) {
        List<Integer> positions = new ArrayList<>();

        for (int i = 0; i < carNum; i++) {
            positions.add(i,0);
        }

        return positions;
    }
}
