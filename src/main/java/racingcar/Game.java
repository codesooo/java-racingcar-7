package racingcar;

import camp.nextstep.edu.missionutils.Randoms;
import racingcar.domain.Car;
import racingcar.output.OutputView;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private final OutputView outputView = new OutputView();

    public void startGame(List<Car> cars, int rounds) {
        outputView.printResult();
        for (int i = 0; i < rounds; i++) {
            playRound(cars);
            outputView.printCarsStatus(cars);
            System.out.println();
        }
    }

    private void playRound(List<Car> cars) {
        for (Car car : cars) {
            int randomNum = Randoms.pickNumberInRange(0, 9);
            if (randomNum >= 4) {
                car.moveForward();
            }
        }
    }
}
