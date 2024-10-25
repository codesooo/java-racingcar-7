package racingcar;

import camp.nextstep.edu.missionutils.test.NsTest;
import org.junit.jupiter.api.Test;

import static camp.nextstep.edu.missionutils.test.Assertions.assertRandomNumberInRangeTest;
import static camp.nextstep.edu.missionutils.test.Assertions.assertSimpleTest;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class ApplicationTest extends NsTest {
    private static final int MOVING_FORWARD = 4;
    private static final int STOP = 3;

    @Test
    void 기능_테스트() {
        assertRandomNumberInRangeTest(
            () -> {
                run("pobi,woni", "1");
                assertThat(output()).contains("pobi : -", "woni : ", "최종 우승자 : pobi");
            },
            MOVING_FORWARD, STOP
        );
    }

    @Test
    void 기능_테스트_자동차3대() {
        assertRandomNumberInRangeTest(
                () -> {
                    run("pobi,woni,jun", "5"); // 자동차 이름과 시도 횟수 설정

                    // 각 라운드와 최종 우승자를 포함하는 예상 출력 검증
                    assertThat(output()).contains(
                            "pobi : -",
                            "woni : ",
                            "jun : -",

                            "pobi : --",
                            "woni : -",
                            "jun : --",

                            "pobi : ---",
                            "woni : --",
                            "jun : ---",

                            "pobi : ----",
                            "woni : ---",
                            "jun : ----",

                            "pobi : -----",
                            "woni : ----",
                            "jun : -----",

                            "최종 우승자 : pobi, jun"
                    );
                },
                MOVING_FORWARD, STOP, MOVING_FORWARD, // 1회차
                MOVING_FORWARD, MOVING_FORWARD, MOVING_FORWARD, // 2회차
                MOVING_FORWARD, MOVING_FORWARD, MOVING_FORWARD, // 3회차
                MOVING_FORWARD, MOVING_FORWARD, MOVING_FORWARD, // 4회차
                MOVING_FORWARD, MOVING_FORWARD, MOVING_FORWARD  // 5회차
        );
    }

    @Test
    void 예외_테스트() {
        assertSimpleTest(() ->
            assertThatThrownBy(() -> runException("pobi,javaji", "1"))
                .isInstanceOf(IllegalArgumentException.class)
        );
    }

    @Override
    public void runMain() {
        Application.main(new String[]{});
    }
}
