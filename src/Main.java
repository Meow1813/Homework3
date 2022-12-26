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

    }

    public static void task1 () {
        System.out.println("Задача 1");
        int intNumber = 1;
        byte byteNumber = 1;
        short shortNumber = 1;
        long longNumber = 1L;
        float floatNumber = 1f;
        double doubleNumber = 1.0;

        System.out.println("Значение переменной intNumber с типом int равно " + intNumber);
        System.out.println("Значение переменной byteNumber с типом byte равно " + byteNumber);
        System.out.println("Значение переменной shortNumber с типом short равно " + shortNumber);
        System.out.println("Значение переменной longNumber с типом long равно " + longNumber);
        System.out.println("Значение переменной floatNumber с типом float равно " + floatNumber);
        System.out.println("Значение переменной doubleNumber с типом double равно " + doubleNumber);
    }

    public static void task2 () {
        System.out.println("Задача 2");
        float num1 = 27.12f;
        long num2 = 987678965549L;
        float num3 = 2.786f;
        short num4 = 569;
        short num5 = -159;
        short num6 = 27897;
        byte num7 = 67;
    }
    public static void task3 () {
        System.out.println("Задача 3");
        byte teacherLP = 23, teacherAS =27, teacherEA = 30;
        short pCount = 480;
        int paperPerStudent = pCount / (teacherAS+ teacherLP + teacherEA);

        System.out.println("На каждого ученика рассчитано " + paperPerStudent + " листов бумаги");
    }
    public static void task4 () {
        System.out.println("Задача 4");
        byte bottlePerMinute = 16/2;
        int bottlePer20Minutes = bottlePerMinute * 20;
        int bottlePerDay = bottlePerMinute * 24 * 60;
        int bottlePer3Days = bottlePerDay * 3;
        int bottlePerMonth = bottlePer3Days * 10;

        System.out.println("За 20 минут машина произвела " + bottlePer20Minutes + " штук бутылок");
        System.out.println("За день машина произвела " + bottlePerDay + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + bottlePer3Days + " штук бутылок");
        System.out.println("За месяц машина произвела " + bottlePerMonth + " штук бутылок");
    }
    public static void task5 () {
        System.out.println("Задача 5");
        byte banksCount = 120;
        byte brownColor = 4;
        byte whiteColor = 2;
        int banksPerClass = brownColor + whiteColor;
        int classCount = banksCount / banksPerClass;
        int brownColorCount = brownColor * classCount;
        int whiteColorCount = whiteColor * classCount;

        System.out.println("В школе, где " + classCount + " классов, нужно " + whiteColorCount + " банок белой краски и " + brownColorCount + " банок коричневой краски");
    }
    public static void task6 () {
        System.out.println("Задача 6");
        short bananasWeight = 5 * 80;
        short milkWeight = 2 * 105;
        short iceCreamWeight = 2 * 100;
        short eggsWeight = 4 * 70;
        int weightInGram = bananasWeight + milkWeight + iceCreamWeight + eggsWeight;
        float weightInKilo = weightInGram / 1000f;

        System.out.println("Вес в граммах - " + weightInGram);
        System.out.println("Вес в килограммах - " + weightInKilo);
    }
    public static void task7 () {
        System.out.println("Задача 7");
        float minCountOfDays = 7 / 0.250f;
        float maxCountOfDays = 7 / 0.500f;
        float avgCountOfDays = 7 / ((0.250f + 0.500f) / 2f );

        System.out.println("Минимальное кол-во дней - " + minCountOfDays);
        System.out.println("Среднее кол-во дней - " + avgCountOfDays);
        System.out.println("Максимальное кол-во дней - " + maxCountOfDays);

    }
    public static void task8 () {
        System.out.println("Задача 8");
        int mSalary = 67760;
        int dSalary = 83690;
        int kSalary = 76230;
        float salaryMultiplier = 1.1f;
        float mNewSalary = mSalary * salaryMultiplier;
        float dNewSalary = dSalary * salaryMultiplier;
        float kNewSalary = kSalary * salaryMultiplier;
        float mSalaryDif = mNewSalary - mSalary;
        float dSalaryDif = dNewSalary - dSalary;
        float kSalaryDif = dNewSalary - dSalary;

        System.out.println("Маша теперь получает " + mNewSalary + " рублей. Годовой доход вырос на " + mSalaryDif + " рублей");
        System.out.println("Денис теперь получает " + dNewSalary + " рублей. Годовой доход вырос на " + dSalaryDif + " рублей");
        System.out.println("Кристина теперь получает " + kNewSalary + " рублей. Годовой доход вырос на " + kSalaryDif + " рублей");


    }
}