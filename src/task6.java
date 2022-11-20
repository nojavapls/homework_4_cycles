public class task6 {
    public static void main(String [] args) {

//            float topUp = 0.07;
        int vklad = 15000;
        int i = 0;
        int year = 9;
        do {
            i ++;
            vklad += vklad/100*7;
            if (i%6 == 0)
                System.out.println("Месяц " + i + " сумма накоплений " + vklad);
            if (i%12 == 0)
                year--;
        } while (year > 0);
    }
}
