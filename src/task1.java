public class task1 {
        public static void main(String [] args) {

            int topUp = 15000;
            int vklad = 0;
            int i = 0;

            do {
                i ++;
                vklad += topUp + vklad*0.01;
                System.out.println("Месяц " + i + " сумма накоплений " + vklad);
            } while (vklad < 2459000);
        }
    }

