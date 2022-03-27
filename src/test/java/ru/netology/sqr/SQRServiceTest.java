package ru.netology.sqr;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SQRServiceTest {


    /**
     * Тест проверяет верно ли рассчитывает метод "calculateSqrt" кол-во чисел возведенных в квадрат
     * @param testName - название тест-кейса
     * @param minRange - нижний диапазон
     * @param maxRange - верхний диапазон
     * @param expected - ожидаемый результат
     */
    @ParameterizedTest
    @CsvSource(value = {"validValue | 200 | 300 | 3",
            "minRange | 100 | 100 | 1",
            "maxRange | 9801 | 9801| 1",
            "maxBorderRange | 100 | 9801 | 90",
            "belowTheRange | 0 | 99 | 0",
            "overTheRange | 9802 | 15000 | 0"}, delimiter = '|')
    void shouldCalculateSqrt(String testName, int minRange, int maxRange, int expected) {
        SQRService service = new SQRService();

        int actual = service.calculateSqrt(minRange, maxRange);

        assertEquals(expected, actual);
    }
}