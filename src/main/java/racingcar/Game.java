package racingcar;

import camp.nextstep.edu.missionutils.Randoms;
import racingcar.domain.Car;
import racingcar.output.OutputView;

import java.util.List;

public class Game {
    private final OutputView outputView;

    public Game(OutputView outputView) {
        this.outputView = outputView;
    }

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
            if (canMoveForward()) {
                car.moveForward();
            }
        }
    }

    private boolean canMoveForward() {
        int randomNum = Randoms.pickNumberInRange(0, 9);
        return randomNum >= 4;
    }
}
