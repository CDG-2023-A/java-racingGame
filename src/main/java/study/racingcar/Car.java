package study.racingcar;

import java.util.Random;
import java.util.Scanner;

public class Car {

//    public static void main(String[] args) {
//        new Car();
//    }
    private Car() {
        numberOfCar();
    }
    public static void numberOfCar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("자동차 대수는 몇 대 인가요?");

        int number = scanner.nextInt();

        System.out.println("시도할 횟수는 몇 회인가요?");
        int attempt = scanner.nextInt();

        System.out.println();
        racingCar(number, attempt);
    }

    public static void racingCar(int number, int attempt) {
        int[] positions = new int[number];
        Random random = new Random();

        for (int i = 0; i < attempt; i++) {
            for (int j = 0; j < number; j++) {
                int forward = random.nextInt(10); // 0부터 9
                if (forward >= 4) { // 전진하는 조건
                    positions[j] += 1;
                }
            }

            for (int pos : positions) {
                if (pos == 0) {
                    System.out.print("ㅡ");
                }
                for (int k = 0; k < pos; k++) {
                    System.out.print("ㅡ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
