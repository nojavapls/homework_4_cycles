public class task4 {
        public static void main(String [] args) {

//            float topUp = 0.07;
            int vklad = 15000;
            int i = 0;

            do {
                i ++;
                vklad += vklad/100*7;
                System.out.println("Месяц " + i + " сумма накоплений " + vklad);
            } while (vklad < 12000000.0);
        }
}
