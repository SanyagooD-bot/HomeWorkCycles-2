public class Main {
    public static void main(String[] args) {
        System.out.println("Домашняя работа №2 Циклы");

        System.out.println("________________Задача 1____________________");
        int capital = 0; //переменная накопления
        int month = 0; //переменная месяца
        while (capital < 2_459_000) {
            month++;
            capital+=15000;
            if (capital < 2_459_000){
                System.out.println("Месяц " + month + "-й сумма накоплений равна " + capital + " рублей");
            }
        }
        System.out.println("____________________________________________");

        System.out.println("________________Задача 2____________________");
        int a = 0;
        while (a < 10) {
            a++;
            System.out.print(" " + a);
        }
        System.out.println();
        for (int b = 10; b >= 1; b-=1) {
            System.out.print(" " + b);
        }
        System.out.println();

        System.out.println("____________________________________________");

        System.out.println("________________Задача 3____________________");
        int year = 0; //годы
        int citizen = 12_000_000;
        double birth = 0.017; // 17/1000 = 0.017
        double death = 0.008; // 8/1000 = 0.008
        int citizenBirth = (int) (citizen * birth);
        int citizenDeath = (int) (citizen * death);
        while (year < 10){
            year = year + 1;
            citizen = citizen + citizenBirth - citizenDeath;
            System.out.println("Год "+ year +" численность населения составляет " + citizen);
        }
        System.out.println("____________________________________________");

        System.out.println("________________Задача 4____________________");
        int month1 = 0; // месяцы
        int deposit = 15000; // 7%
        while (deposit < 12_000_000){
            month1++;
            deposit = (int)(deposit + deposit * 0.07); // 0.07 = 7%
            System.out.println("Месяц "+ month1 +"-й сумма накопления составляет " + deposit);
        }
        System.out.println("____________________________________________");

        System.out.println("________________Задача 5____________________");
        int month5 = 0; // месяцы
        int deposit5 = 15000; // 7%
        while (deposit5 < 12_000_000) {
            deposit5 = (int) (deposit5 + deposit5 * 0.07); // 0.07 = 7%
            month5++;
            if (month5 % 6 == 0) {
                System.out.println("Месяц " + month5 + "-й сумма накопления составляет " + deposit5);
            }
        }
        System.out.println("____________________________________________");

        System.out.println("________________Задача 6____________________");
        int month6 = 0; // месяцы
        int deposit6 = 15000; // 7%
        while (deposit6 < 50_000_000){
            deposit6 = (int) (deposit6 + deposit6 * 0.07); // 0.07 = 7%
            month6++;
            if (month6 % 18 == 0) {
                System.out.println("Месяц " + month6 + "-й сумма накопления составляет " + deposit6);
            }
        }
        System.out.println("(18 месяцев = 1.5 года)");
        System.out.println("____________________________________________");

        System.out.println("________________Задача 7____________________");
        int friday = 4;
        for (; friday < 31; friday+=7)
        {
            System.out.println("Сегодня пятница, "+friday+ "-е число. Необходимо подготовить отчет.");
        }

        System.out.println("____________________________________________");

        System.out.println("________________Задача 8____________________");
        int comet = 0; //year
        while (comet < 2024){
            comet+=79;
            if (comet > 1824){
                System.out.println(comet);
            }
        }
        System.out.println("____________________________________________");


    }

}
