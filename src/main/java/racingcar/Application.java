package racingcar;

import racingcar.domain.Car;
import racingcar.domain.CarFactory;
import racingcar.domain.WinnerSelector;
import racingcar.input.InputReader;
import racingcar.output.OutputView;
import racingcar.input.CarNameParser;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        InputReader inputReader = new InputReader();
        OutputView outputView = new OutputView();
        CarNameParser carNameParser = new CarNameParser();
        WinnerSelector winnerSelector = new WinnerSelector();
        Game game = new Game(outputView);

        // 자동차 이름 입력
        outputView.printCarNamePrompt();
        String carNamesInput = inputReader.carNames();

        List<String> carNames = carNameParser.parseCarNames(carNamesInput);
        List<Car> cars = CarFactory.createCars(carNames);

        // 시도 횟수 입력
        outputView.printTryNumPrompt();
        int round = inputReader.numberOfTries();

        // 경주 시작
        game.startGame(cars, round);

        // 우승자 선정
        List<String> winners = winnerSelector.selectWinners(cars);
        outputView.formatWinners();
        System.out.println(outputView.printWinners(winners));
    }
}
