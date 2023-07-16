public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();

    }

    public static void task1() {
        System.out.println("Задача 1");
        for (int k = 1; k <= 10; k = k + 1) {
            System.out.println(k);
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        for (int k = 10; k >= 1; k = k - 1) {
            System.out.println(k);
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        for (int k = 0; k <= 17; k = k + 2) {
            System.out.println(k);
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        for (int k = 10; k >= -10; k = k - 1) {
            System.out.println(k);
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        for (int k = 1904; k <= 2096; k = k + 4) {
            System.out.println(k + " год является високосным");
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        for (int k = 7; k <= 98; k = k + 7) {
            System.out.println(k);
        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        for (int k = 1; k <= 512; k = k * 2) {
            System.out.println(k);
        }
    }

    public static void task8() {
        System.out.println("Задача 8");
        int salary = 29000;
        int total = 0;

        for (int i = 1; i <= 12; i++) {
            total = total + salary;

            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей.");
        }
    }
    public static void task9() {
        System.out.println("Задача 9");
        int salary = 29000;
        double total = 0;

        int salaryWithPenny = salary * 100;
        int totalWithPenny = 0;
        for (int i = 1; i <= 12; i++) {
            totalWithPenny = totalWithPenny + totalWithPenny / 100;
            totalWithPenny = totalWithPenny + salaryWithPenny;

            total = totalWithPenny / 100.;

            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей.");
        }
    }

    public static void task10() {
        System.out.println("Задача 10");
        int a = 2;
        int b = 1;
        int total = a * b;
        for (; b <= 10; b++) {
            total = a * b;

            System.out.println(a + " * " + b + " = " + total);
        }
    }
}


