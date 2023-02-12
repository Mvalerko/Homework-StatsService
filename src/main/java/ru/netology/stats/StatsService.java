package ru.netology.stats;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Arrays;

public class StatsService {
    public static void main(String[] args) {
        //System.out.println("Вот показатели наших продаж 2022 по месяцам (от января до декабря): ");
        int[] grades = {89_497, 91_574, 94_123, 87_986, 88_994, 92_527, 90_654, 102_841, 88_385, 88_562, 95_132, 102_741};
        double[] numbersG = Arrays.stream(grades).asDoubleStream().toArray();

        DecimalFormatSymbols symbols = DecimalFormatSymbols.getInstance();
        symbols.setGroupingSeparator(' ');
        DecimalFormat formatter = new DecimalFormat("###,###.##", symbols);

        //printAllGrades(grades);
        //System.out.println("Максимальная сумма продаж за месяц составила " + formatter.format(bestGrade(grades)));
        System.out.println("Сумма всех продаж составила " + formatter.format(salesAmount(grades)));
        System.out.println("Средний показатель продаж " + formatter.format(midGrade(numbersG)));
        System.out.println("Последний зафиксированный показатель лучших продаж в году: Месяц № " + getMaxMonth(grades));
        System.out.println("Последний зафиксированный показатель худших продаж в году: Месяц № " + getMinMonth(grades));
        System.out.println("Месяцев, с показателем продаж ниже среднего было " + Math.round(getBadMonth(numbersG)));
        System.out.println("Месяцев, с показателем продаж выше среднего было " + Math.round(getGoodMonth(numbersG)));
    }

    /*
    public static void printAllGrades(int[] numbers) {
        System.out.print("|");
        for (int num : numbers) {

            System.out.print(num + "|");
        }
        System.out.println();
    }

    public static int bestGrade(int[] numbers) {
        int maxGrade = numbers[0];
        for (int num : numbers) {
            if (num > maxGrade) {
                maxGrade = num;
            }
        }
        return maxGrade;
    }
*/
    public static int salesAmount(int[] numbers) {
        int sAmount = 0;
        for (int i = 0; i < numbers.length; i++) {
            sAmount = sAmount + numbers[i];
        }
        return sAmount;
    }

    public static double midGrade(double[] numbers) {
        double grade = 0;
        for (double num : numbers) {
            grade = num + grade;
        }
        return ((double) grade / numbers.length);

    }

    public static int getMaxMonth(int[] numbers) {
        int maxMonth = 0;
        for (int i = numbers.length - 1; i >= 0; i--) {
            if (numbers[i] > numbers[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public static int getMinMonth(int[] numbers) {
        int minMonth = 0;
        for (int i = numbers.length - 1; i >= 0; i--) {
            if (numbers[i] < numbers[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public static double getBadMonth(double[] numbers) {
        double mGrade = midGrade(numbers);
        int badMonth = 0;
        for (double sale : numbers) {
            if (sale < mGrade) {
                badMonth++;
            }
        }
        return badMonth;
    }

    public static double getGoodMonth(double[] numbers) {
        double mGrade = midGrade(numbers);
        int badMonth = 0;
        for (double sale : numbers) {
            if (sale > mGrade) {
                badMonth++;
            }
        }
        return badMonth;
    }

}


