package racingcar.input;

import camp.nextstep.edu.missionutils.Console;

public class InputReader {
    public String carNames() {
        return Console.readLine();
    }

    public int numberOfTries() {
        return Integer.parseInt(Console.readLine());
    }
}
