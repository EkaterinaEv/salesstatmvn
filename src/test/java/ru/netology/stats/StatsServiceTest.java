package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void findMinMonthOfSales() {
        StatsService service = new StatsService();

        int[] salesData = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonth = 9;
        int actualMonth = service.minSalesMonth(salesData);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void findMaxMonthOfSales() {
        StatsService service = new StatsService();

        int[] salesData = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonth = 8;
        int actualMonth = service.maxSalesMonth(salesData);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void SumOfSales() {
        StatsService service = new StatsService();

        int[] salesData = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSum = 180;
        int actualSum = service.allSalesSum(salesData);

        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void AverageOfSales() {
        StatsService service = new StatsService();

        int[] salesData = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedAverageSum = 15;
        int actualAverageSum = service.averageSaleSum(salesData);

        Assertions.assertEquals(expectedAverageSum, actualAverageSum);
    }

    @Test
    public void MonthsBelowAverageSales() {
        StatsService service = new StatsService();

        int[] salesData = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedNumbersOfMonth = 5;
        int actualNumbersOfMonth = service.monthsOfBelowAverageSales(salesData);

        Assertions.assertEquals(expectedNumbersOfMonth, actualNumbersOfMonth);
    }

    @Test
    public void monthsOfAboveAverageSales() {
        StatsService service = new StatsService();

        int[] salesData = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedNumbersOfMonth = 5;
        int actualNumbersOfMonth = service.monthsOfAboveAverageSales(salesData);

        Assertions.assertEquals(expectedNumbersOfMonth, actualNumbersOfMonth);
    }

}