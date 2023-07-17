package ru.netology.stats;

public class StatsService {
    public int minSalesMonth(int[] sales) { //номер месяца, в котором был минимум продаж
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int maxSalesMonth(int[] sales) { //номер месяца, в котором был максимум продаж
        int maxMonth = 0; // номер месяца с максимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i; // запомним его как максимальный
            }
        }

        return maxMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int allSalesSum(int[] sales) { // сумма всех продаж
        int allSales = 0;

        for (int s : sales) {
            allSales += s;
        }
        return allSales;
    }

    public int averageSaleSum(int[] sales) { // средняя сумма продаж в месяц
        int allSales = 0;

        for (int s : sales) {
            allSales += s;
        }
        return allSales / sales.length;
    }

    public int monthsOfBelowAverageSales(int[] sales) { //количество месяцев, в которых продажи были ниже среднего
        int underAverage = 0;

        for (int sale : sales) {
            if (sale < averageSaleSum(sales)) { // значит, в этом месяце продажи ниже среднего
                underAverage += 1;
            }
        }

        return underAverage;
    }

    public int monthsOfAboveAverageSales(int[] sales) { //количество месяцев, в которых продажи были выше среднего
        int overAverage = 0;

        for (int sale : sales) {
            if (sale > averageSaleSum(sales)) { // значит, в этом месяце продажи выше среднего
                overAverage += 1;
            }
        }

        return overAverage;
    }

}
