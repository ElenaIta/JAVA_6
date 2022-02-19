package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
        // Тест 1 - Сумму всех продаж
    void shouldCalculateTotalSumSales() {
        StatsService service = new StatsService();

        // подготавливаем данные:
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;

        // вызываем целевой метод:
        int actual = service.calculateStatSale(sales);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);

    }

    @Test
        // Тест 2 - Средняя сумма продаж в месяц
    void shouldAveregeMonthlySale() {
        StatsService service = new StatsService();

        // подготавливаем данные:
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;

        // вызываем целевой метод:
        int actual = service.AveregeMonthlySale(sales);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);

    }


    @Test
        //тест 3 - Номер месяца, в котором был пик продаж
    void shouldCalculateMaxMonthly() {
        StatsService service = new StatsService();

        // подготавливаем данные:
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;

        // вызываем целевой метод:
        int actual = service.MaxMonthlySale(sales);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }


    @Test   //тест 4 - Номер месяца, в котором был минимум продаж
    void shouldCalculateMinMonthly() {
        StatsService service = new StatsService();

        // подготавливаем данные:
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;

        // вызываем целевой метод:
        int actual = service.MinMonthlySale(sales);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }



    @Test   //тест 5 - Кол-во месяцев, в которых продажи были ниже среднего
    void shouldTotalMinMonthlySale() {
        StatsService service = new StatsService();

        // подготавливаем данные:
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        // вызываем целевой метод:
        int actual = service.TotalMinMonthlySale(sales);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }


    @Test   //тест 6 - Кол-во месяцев, в которых продажи были выше среднего
    void shouldTotalMaxMonthlySale() {
        StatsService service = new StatsService();

        // подготавливаем данные:
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        // вызываем целевой метод:
        int actual = service.TotalMaxMonthlySale(sales);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }
}
