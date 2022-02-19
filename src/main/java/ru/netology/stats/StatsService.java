package ru.netology.stats;

public class StatsService {

    // целевой метод 1 - тест 1 Сумму всех продаж
    public int calculateStatSale(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;

        }
        return sum;
    }


    // целевой метод 2 - тест 2 Средняя сумма продаж в месяц
    public int AveregeMonthlySale(int[] sales) {
        return calculateStatSale(sales) / sales.length;
    }


    // целевой метод 3 - тест 3 - Номер месяца, в котором был пик продаж
    public int MaxMonthlySale(int[] sales) {
        int currentMax = 0; // переменная для хранения номера ячейки в массиве того месяца,в кот были max продажи
        int monthly = 0; // переменная для рассматриваемого месяца в массиве
        for (int sale : sales) {
            if (sale >= sales[currentMax]) {
                currentMax = monthly;
            }
            monthly = monthly + 1;
        }
        return currentMax + 1;
    }


    // целевой метод 4 - тест 4   Номер месяца, в котором был минимум продаж
    public int MinMonthlySale(int[] sales) {
        int currentMin = 0; // переменная для хранения номера ячейки в массиве того месяца,в кот были max продажи
        int monthly = 0; // переменная для рассматриваемого месяца в массиве
        for (int sale : sales) {
            if (sale <= sales[currentMin]) {
                currentMin = monthly;
            }
            monthly = monthly + 1;
        }
        return currentMin + 1;
    }


    // целевой метод 5 - тест 5   Кол-во месяцев, в которых продажи были ниже среднего
    public int TotalMinMonthlySale(int[] sales) {
        int avr = AveregeMonthlySale(sales);
        int counter = 0;
        for (int sale : sales) {
            if (sale < avr) {
                counter++;
            }
        }
        return counter;
    }


    // целевой метод 6 - тест 6   Кол-во месяцев, в которых продажи были выше среднего
    public int TotalMaxMonthlySale(int[] sales) {
        int avr = AveregeMonthlySale(sales);
        int counter = 0;
        for (int sale : sales) {
            if (sale > avr) {
                counter++;
            }
        }
        return counter;
    }
}



