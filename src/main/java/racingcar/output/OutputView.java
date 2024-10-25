package racingcar.output;

import java.sql.SQLOutput;

public class OutputView {
    public void printCarNamePrompt() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
    }

    public void printTryNumPrompt() {
        System.out.println("시도할 횟수는 몇 회인가요?");
    }

    public void printResult() {
        System.out.println("실행 결과");
    }

    public void printWinner() {
        System.out.print("최종 우승자 : ");
    }
}
