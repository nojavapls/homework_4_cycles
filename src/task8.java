public class task8 {
    public static void main(String[] args) {

        int currentYear = 2022;
        int startYear = currentYear - 200;
        int finishYear = currentYear + 100;
        int i = 0;
        while (i < finishYear) {
            i++;
            for (i = startYear; i < finishYear; i += 79) {
                System.out.println(i);
            }
        }
    }
}
