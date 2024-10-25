package racingcar;

import racingcar.input.InputReader;
import racingcar.output.OutputView;

public class Application {
    public static void main(String[] args) {
        InputReader inputReader = new InputReader();
        OutputView outputView = new OutputView();

        // 자동차 이름 입력
        outputView.printCarNamePrompt();
        inputReader.carNames();

        // 시도 횟수 입력
        outputView.printTryNumPrompt();
        inputReader.numberOfTries();
    }
}
