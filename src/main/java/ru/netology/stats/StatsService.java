package ru.netology.stats;

public class StatsService {
    public long sum(long[] sales) {
        long sumAll = 0;

        for (int i = 0; i < sales.length; i++) {
            sumAll += sales [i];
        }

        return sumAll;
    }

    public long average(long[] sales){
        long sumAll = 0;

        for (int i = 0; i < sales.length; i++) {
            sumAll += sales [i];
        }
        long averageSale = sumAll / 12;
        return averageSale;
    }

    public int mounthMax(long [] sales) {
        int mounthMaxSale = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[mounthMaxSale]) {
                mounthMaxSale = i;
            }
        }
        return mounthMaxSale + 1;
    }

    public int mounthMin(long [] sales) {
        int mounthMinSale = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[mounthMinSale]) {
                mounthMinSale = i;
            }
        }
        return mounthMinSale + 1;
    }

    public int mounthNAverage(long[] sales){
        int counter = 0;
        long averageSale = average(sales);
        for (long sale : sales) {
            if (sale < averageSale) {
                counter++;
            }
        }
        return counter;
    }

    public int mounthBAverage(long[] sales){
        int counter = 0;
        long averageSale = average(sales);
        for (long sale : sales) {
            if (sale > averageSale) {
                counter++;
            }
        }
        return counter;
    }

}
