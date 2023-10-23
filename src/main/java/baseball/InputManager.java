package baseball;

import camp.nextstep.edu.missionutils.Console;
import java.util.ArrayList;

public class InputManager {
    ArrayList<Integer> takeUserAnswerInput() {
        String userInput;
        ArrayList<Integer> userInputNum;

        userInput = Console.readLine();
        userInputNum = new ArrayList<>();
        for (int i = 0; i < 3; i ++) {
            userInputNum.add(Integer.parseInt(String.valueOf(userInput.charAt(i))));
        }
        return (userInputNum);
    }

    int takeUserEndOrRetryInput() {
        int userInputNum;
        String userInput;

        userInput = Console.readLine();
        userInputNum = Integer.parseInt(userInput);
        return (userInputNum);
    }
}