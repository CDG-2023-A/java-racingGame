package study.racingcar.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static study.racingcar.view.ResultView.printRaceResult;
import static study.racingcar.view.ResultView.requestCarsToMove;

public class CarController {

    public static void racingCar(int carNum, int attemptNum) {
        List<Integer> positions = new ArrayList<>();
        Random random = new Random();

        addCar(carNum, positions);

        for (int i = 0; i < attemptNum; i++) {
            requestCarsToMove(carNum, positions, random);
            printRaceResult(positions);
        }
    }

    public static void addCar(int carNum, List<Integer> positions) {
        for (int i = 0; i < carNum; i++) {
            positions.add(i,0);
        }
    }
}
