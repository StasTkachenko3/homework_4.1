public class Task_07 {
    static int COUNT = 0;
    public static void main(String[] args) {
        System.out.println("Задание №7");
        for (int i = 10_000_000; i <= 99_999_999; i++) {
            if (hasUniqueDigits(i) && i % 12345 == 0){
                COUNT++;
            }

        }
        System.out.println("Общее количество " + COUNT);

    }
    private static boolean hasUniqueDigits (int number){
        boolean [] digits = new boolean[10];
        while (number > 0){
            int digit = number % 10;
            if (digits[digit]){
                return false;
            }
            digits[digit] = true;
            number = number / 10;
        }
        return true;
    }
}
