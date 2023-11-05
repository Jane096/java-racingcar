package step3;

import step3.validation.ValidateCarsInput;

import java.util.Scanner;

import static step3.constants.QuestionConstants.HOW_MANY_CARS;

public class Cars {

    private static final int MINIMUM_PLAYING_TIMES = 4;

    public static int carsInput(Scanner scanner) {
        System.out.println(HOW_MANY_CARS);
        int cars = scanner.nextInt();

        return ValidateCarsInput.positiveNumber(cars);
    }

    public static boolean isMovable(int times) {
        return times >= MINIMUM_PLAYING_TIMES;
    }

    public static String go(String currentStatus) {
        return currentStatus == null ? "-" : currentStatus + "-";
    }
}
