package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;


public class StatsServiceTest {

    @Test
    public void salesAmountTest() {
        //знакомим наш тестовый метод с классом SQRService
        StatsService service = new StatsService();

        int[] arr = {8, 15, 13, 15, 17, 20, 19, 21, 7, 14, 14, 20};
        int expected = 183;
        int actual = StatsService.salesAmount(arr);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void midGradeTest() {
        //знакомим наш тестовый метод с классом SQRService
        StatsService service = new StatsService();

        double[] arr = {8, 15, 13, 15, 17, 20, 19, 21, 7, 14, 14, 20};
        double expected = 15.25;
        double actual = StatsService.midGrade(arr);

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void getMaxMonthtTest() {
        //знакомим наш тестовый метод с классом SQRService
        StatsService service = new StatsService();

        int[] arr = {8, 15, 13, 15, 17, 20, 19, 21, 7, 14, 14, 20};
        int expected = 8;
        int actual = StatsService.getMaxMonth(arr);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getMinMonthtTest() {
        //знакомим наш тестовый метод с классом SQRService
        StatsService service = new StatsService();

        int[] arr = {8, 15, 13, 15, 17, 20, 19, 21, 7, 14, 14, 20};
        int expected = 9;
        int actual = StatsService.getMinMonth(arr);

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void getBadMonthTest() {
        //знакомим наш тестовый метод с классом SQRService
        StatsService service = new StatsService();

        double[] arr = {8, 15, 13, 15, 17, 20, 19, 21, 7, 14, 14, 20};
        double expected = 7;
        double actual = StatsService.getBadMonth(arr);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getGoodMonthTest() {
        //знакомим наш тестовый метод с классом SQRService
        StatsService service = new StatsService();

        double[] arr = {8, 15, 13, 15, 17, 20, 19, 21, 7, 14, 14, 20};
        double expected = 5;
        double actual = StatsService.getGoodMonth(arr);

        Assertions.assertEquals(expected, actual);
    }
}