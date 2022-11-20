public class task3 {
    public static void main(String [] args) {
        int naselenie = 12000000;
        int rozhd = naselenie/1000*17;
        int smert = naselenie/1000*8;
        int i = 1;
        do {
            System.out.println("Год "+ i +", численность населения составляет " + (naselenie ));
            naselenie = naselenie + rozhd - smert;
            rozhd = naselenie/1000*17;
            smert = naselenie/1000*8;
            i++;
        } while (i <= 10);

    }
}
