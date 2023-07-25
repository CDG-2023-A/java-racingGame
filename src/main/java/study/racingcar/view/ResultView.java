package study.racingcar.view;

import study.racingcar.model.Car;

import java.util.List;

public class ResultView {
    public static void printRaceResult(List<Car> carList) {
        for (Car car : carList) {
            for (int k = 0; k < car.getPositions(); k++) {
                System.out.print("ㅡ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
