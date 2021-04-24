package ru.netology.stats;
// Сумма всех элементов массива
public class StatsService {
    public int calculateSum(int[] values) {
        int sum = 0;
        for (int value : values) {
            sum = sum + value;
        }
        return sum;
    }

    //Среднее арифметическое элементов масиива
    public int calculateAver(int[] values) {
        int average = calculateSum(values) / values.length;
        return average;
    }

    //Последний Месяц максимальных продаж
    public int maxPurchaisesMonth(int[] values) {
        int month = 0;
        int indexMaxmonth = 0;
        int maxMonth = values[0];
        for (int value : values) {
               month = month + 1;
            if (maxMonth <= value) {
                maxMonth = value;
                indexMaxmonth = month;
            }
        }
        return indexMaxmonth;
    }

    // Последний месяц минимальных продаж
    public int minPurchaisesMonth(int[] values) {
        int month = 0;
        int minMonth = values[0];
        int indexMinmonth = 0;
        for (int value : values) {

            month = month + 1;
            if (minMonth >= value) {
                minMonth = value;
                indexMinmonth = month;
            }
        }
        return indexMinmonth;
    }

    //Количество месяцев с продажами ниже среднего
    public int countMinPurchaisesMonth(int[] values) {
        int average = calculateSum(values) / values.length;
        int month = 0;
        //int average = 15;
        for (int i = 0; i < values.length; i++) {
            int minMonth = values[i];
            if (minMonth < average) {
                //maxMonth=value;
                month = month + 1;
            }
        }

        return month;
    }

    //Количество месяцев с продажами выше среднего
    public int countMaxPurchaisesMonth(int[] values) {
        int average = calculateSum(values) / values.length;
        int month = 0;
        //int average = 15;

        for (int i = 0; i < values.length; i++) {
            int maxMonth = values[i];
            if (maxMonth > average) {

                //maxMonth=value;
                month = month + 1;
            }
        }

        return month;
    }
}
