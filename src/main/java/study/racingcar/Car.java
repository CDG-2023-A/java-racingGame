package study.racingcar;

import java.util.Scanner;

public class Car {

    public static int numberOfCar(String input) {
        System.out.println("자동차 대수는 몇 대 인가요?");

        Scanner scanner = new Scanner(System.in);
        String number = scanner.next();

        return Integer.getInteger(number);
    }
}
