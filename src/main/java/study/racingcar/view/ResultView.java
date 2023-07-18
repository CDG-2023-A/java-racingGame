package study.racingcar.view;

import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ResultView {

    public static void requestCarsToMove(int carNum, List<Integer> positions, Random random) {
        for (int j = 0; j < carNum; j++) {
            int forward = random.nextInt(10); // 0부터 9
            if (forward >= 4) { // 전진하는 조건
                int currentValue = positions.get(j);
                int newValue = currentValue + 1;
                positions.set(j, newValue);
            }
        }
    }

    public static void printRaceResult(List<Integer> positions) {
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
