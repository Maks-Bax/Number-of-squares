package ru.netology.sqr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SQRServiceTest {

    @ParameterizedTest
    @CsvSource(value = {"'Calculate the number of squares from the interval', 10, 99, 6",
            "'Calculate the number of squares the interval from 200 to 300', 200, 300, 3",
            "'Calculate the number of squares the interval from 2000 to 3000', 2000, 3000, 10"})
    void shouldCalculatingSquaresFromGap(String testName, int start, int stop, int expected) {
        SQRService service = new SQRService();
        int actual = service.squareCounter(start, stop);

        assertEquals(expected, actual);
    }
}