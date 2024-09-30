public class Main {
    public static void main(String[] args) {
        System.out.println("Домашняя работа №2 Циклы");

        System.out.println("________________Задача 1____________________");

        int solary1 = 0;
        int i = 0;

        while (solary1 <= 2_459_000)
        {
            solary1 = solary1 + 15000;
            i = i + 1;
            System.out.println("Месяц " + i + "-й сумма накоплений равна " +solary1+ " рублей");

        }
        System.out.println("____________________________________________");
        System.out.println("________________Задача 2____________________");

        int a = 0;
        int b = 11;
        while (a < 10)
        {
            a = a + 1;
            System.out.print(" " + a);
        }
        System.out.println();

        while (b > 1)
        {
            b = b - 1;
            System.out.print(" " + b);
        }
        System.out.println();

        System.out.println("____________________________________________");

        System.out.println("________________Задача 3____________________");
        int I = 0;
        int populationSize = 12_000_000;
        int birth = 17;
        int death = 8;
        int birthRate;
        int mortalityRate;
        birthRate = birth * 12000;
        mortalityRate = death * 12000;
        while (I < 10){
            I = I + 1;
            populationSize = populationSize + birthRate - mortalityRate;
            System.out.println("Год "+ I +" численность населения составляет " + populationSize);
        }

        System.out.println("____________________________________________");

        System.out.println("________________Задача 4____________________");






        System.out.println("____________________________________________");





    }
}