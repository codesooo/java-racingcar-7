package racingcar.util;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CarNameParser {
    public List<String> parseCarNames(String carNamesInput) {
        List<String> carNames = Arrays.stream(carNamesInput.split(","))
                .map(String::trim)
                .filter(name -> !name.isEmpty())
                .collect(Collectors.toList());

        if (carNames.isEmpty()) {
            throw new IllegalArgumentException("자동차 이름이 올바르지 않습니다.");
        }

        for (String name : carNames) {
            if (name.length() > 5) {
                throw new IllegalArgumentException("자동차 이름은 5자 이하이어야 합니다: " + name);
            }
        }
        return carNames;
    }
}
