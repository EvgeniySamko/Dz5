package ru.skypro;

public class Main {

    public static void main(String[] args) {
        int[] arr = generateRandomArray();
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }


    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        int sum = 0;
        int maxSum = 100_000;
        int minSum = 200_000;
        double averageSum = 0;


        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;

            /// if (arr[i] <= 200_000) {
            //   System.out.println(arr[i]);
            //  }
        }
        for (int a : arr) {
            sum += a;


        }

        for (int j : arr) {
            if (j >= maxSum) {
                maxSum = j;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= minSum) {
                minSum = arr[i];

            }

        }
        averageSum = sum / arr.length;


        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
        System.out.println("Максимальная сумма трат за день составила " + maxSum + " рублей");
        System.out.println("Минимальная сумма трат за день составила " + minSum + " рублей");
        System.out.println("Средняя сумма трат за месяц составила " + averageSum + " рублей");

        return arr;
    }

}