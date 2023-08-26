public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int element : arr) {
            sum += element;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");

    }

    public static void task2() {
        System.out.println("Задача 2");
        int[] arr = generateRandomArray();
        int minAmountSpentPerDay = 200000;
        int maxAmountSpentPerDay = -1;
        for (int i = 0; i < arr.length; i++) {
            if (i < minAmountSpentPerDay) {
                minAmountSpentPerDay = arr[i];
            }
            if (i > maxAmountSpentPerDay) {
                maxAmountSpentPerDay = arr[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minAmountSpentPerDay + " рублей. Максимальная сумма трат за день составила " + maxAmountSpentPerDay + " рублей");
    }

    public static void task3() {
        System.out.println("Задача 3");
        int[] arr = generateRandomArray();
        int averageSpendingPerMonth = 0;
        int numberOfDays = arr.length;
        int sum = 0;
        for (int element : arr) {
            sum += element;
        }
        averageSpendingPerMonth = sum / numberOfDays;
        System.out.println("Средняя сумма трат за месяц составила " + averageSpendingPerMonth + " рублей");
    }

    public static void task4() {
        System.out.println("Задача 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}