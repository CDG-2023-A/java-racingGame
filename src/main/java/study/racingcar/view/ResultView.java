package study.racingcar.view;

import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ResultView {
    public static void printRaceResult(List<Integer> positions) {
        for (int pos : positions) {
            for (int k = 0; k < pos; k++) {
                System.out.print("ㅡ");
            }
            System.out.println();
        }
    }
}
