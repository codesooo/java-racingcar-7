package racingcar.input;

import camp.nextstep.edu.missionutils.Console;

public class InputReader {
    public String carNames() {
        String input = Console.readLine();
        if (input == null || input.trim().isEmpty()) {
            throw new IllegalArgumentException("자동차 이름을 입력하지 않았습니다.");
        }
        return input;
    }

    public int numberOfTries() {
        try {
            String input = Console.readLine();
            return Integer.parseInt(input); // 숫자 입력 처리
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("잘못된 입력입니다. 숫자를 입력해주세요.");
        }
    }
}
