package racingcar;

import java.util.List;

public class PrintUtils {

    public static void printErrorCarLength() {
        System.out.println(Constant.ERROR_CAR_LENGTH);
    }

    public static void printErrorOverlapCarName() {
        System.out.println(Constant.ERROR_OVERLAP_CAR_NAME);
    }

    public static void printErrorTryCountNumber() {
        System.out.println(Constant.ERROR_TRY_COUNT_NUMBER);
    }

    public static void printExecutionResult() {
        System.out.println("\n" + Constant.EXECUTION_RESULT);
    }

    public static void printWinner(List<String> winnerList) {
        System.out.print(Constant.FINAL_WINNER);
        winnerList
            .stream()
            .limit(winnerList.size() - 1)
            .forEach(winner -> System.out.print(winner + ", "));
        System.out.print(winnerList.get(winnerList.size() - 1));
    }

    public static void printInputRequestCarName() {
        System.out.println(Constant.INPUT_REQUEST_CAR_NAME);
    }

    public static void printInputRequestPlayTime() {
        System.out.println(Constant.INPUT_REQUEST_PLAY_TIME);
    }

}
