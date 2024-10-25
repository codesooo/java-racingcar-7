package racingcar.output;

import racingcar.domain.Car;

import java.sql.SQLOutput;
import java.util.List;

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

    public void printCarsStatus(List<Car> cars) {
        for (Car car : cars) {
            System.out.println(car.getCarName() + " : " + "-".repeat(car.getForwardCount()));
        }
    }

    public void printWinnerMessage() {
        System.out.print("최종 우승자 : ");
    }

    public String printWinners(List<String> winners) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < winners.size(); i++) {
            sb.append(winners.get(i));
            if (i != winners.size() - 1) {
                sb.append(", ");
            }
        }
        return String.valueOf(sb);
    }
}
