package study.racingcar.view;

import java.util.Scanner;

import static study.racingcar.controller.CarController.racingCar;

public class InputView {

    public static int numberOfCar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("자동차 대수는 몇 대 인가요?");
        int carNum = scanner.nextInt();

        return carNum;
    }

    public static int numberOfAttempt() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("시도할 횟수는 몇 회인가요?");
        int attemptNum = scanner.nextInt();
        System.out.println();

        return attemptNum;
    }
}