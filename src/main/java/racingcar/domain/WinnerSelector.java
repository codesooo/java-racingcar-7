package racingcar.domain;

import java.util.ArrayList;
import java.util.List;

public class WinnerSelector {
    public List<String> selectWinners(List<Car> cars) {
        int max = 0;
        List<String> winners = new ArrayList<>();

        // 최대값 찾기
        for (Car car : cars) {
            if (car.getForwardCount() > max) {
                max = car.getForwardCount();
            }
        }

        // 최대값과 동일한 car를 우승자로 추가
        for (Car car : cars) {
            if (car.getForwardCount() == max) {
                winners.add(car.getCarName());
            }
        }
        return winners;
    }
}
