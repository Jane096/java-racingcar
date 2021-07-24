package racingcar.domain.vehicle;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import racingcar.common.exception.InvalidCarNameException;

@DisplayName("[Step4] 자동차 이름")
class NameTest {

    @DisplayName("[성공] 생성")
    @ParameterizedTest
    @CsvSource(value = {
        "pobi"}
    )
    public void create(String name) {
        // given

        // when
        Name carName = new Name(name);

        // then
        assertThat(carName).isEqualTo(new Name(name));
    }

    @DisplayName("[실패] 생성 - 너무 긴 자동차 이름")
    @ParameterizedTest
    @CsvSource(value = {
        "pobipobi"}
    )
    public void create_tooLongName(String name) {
        // given

        // when
        Assertions.assertThrows(InvalidCarNameException.class, () -> new Name(name));

        // then
    }
}
