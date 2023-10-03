package hw3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import seminars.third.hw.HW3;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class HW3Tests {



    HW3 num = new HW3();
    @BeforeEach

    @Test
    void evenNumberTest() {
        assertThat(num.evenOddNumber(10)).isTrue();
    }

    @Test
    void oddNumberTest() {
        assertThat(num.evenOddNumber(5)).isFalse();
    }

    @Test
    void numberInIntervalOutLeftTest() {
        assertThat(num.numberInInterval(25)).isFalse();
    }



    @Test
    void numberInIntervalOInRightTest() {
        assertThat(num.numberInInterval(99)).isTrue();
    }

    @Test
    void numberInIntervalOutRightTest() {
        assertThat(num.numberInInterval(100)).isFalse();
    }
}
