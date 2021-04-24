package ru.netology.stats;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
//Сумма элементов массива
    @org.junit.jupiter.api.Test
    void shouldcalculateSum() {
        StatsService service = new StatsService();
        // подготавливаем данные:
        int[] values = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        // вызываем целевой метод:
        long actual = service.calculateSum(values);
        assertEquals(expected, actual);
    }
//Среднее элементов массива
    @org.junit.jupiter.api.Test
    void shouldcalculateAverage() {
        StatsService service = new StatsService();
        // подготавливаем данные:
        int[] values = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        // вызываем целевой метод:
        long actual = service.calculateAver(values);
        assertEquals(expected, actual);
    }
//Номер месяца с максимальными продажами
    @org.junit.jupiter.api.Test
    void shouldFindNumberMaxpurchaisesMonth() {
        StatsService service = new StatsService();
        // подготавливаем данные:
        int[] values = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        // вызываем целевой метод:
        int actual = service.maxPurchaisesMonth(values);
        assertEquals(expected, actual);
    }
//Номер месяца с минимальными продажами
    @org.junit.jupiter.api.Test
    void shouldFindNumberMinpurchaisesMonth() {
        StatsService service = new StatsService();
        // подготавливаем данные:
        int[] values = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        // вызываем целевой метод:
        long actual = service.minPurchaisesMonth(values);
        assertEquals(expected, actual);
    }
    // Количество месяцев с продажами ниже среднего
    @org.junit.jupiter.api.Test
    void shouldCountNumberMinpurchaisesMonth() {
        StatsService service = new StatsService();
        // подготавливаем данные:
        int[] values = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        // вызываем целевой метод:
        long actual = service.countMinPurchaisesMonth(values);
        assertEquals(expected, actual);
    }
    // Количество месяцев с продажами выше среднего
    @org.junit.jupiter.api.Test
    void shouldCountNumberMaxpurchaisesMonth() {
        StatsService service = new StatsService();
        // подготавливаем данные:
        int[] values = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        // вызываем целевой метод:
        long actual = service.countMaxPurchaisesMonth(values);
        assertEquals(expected, actual);
    }
}