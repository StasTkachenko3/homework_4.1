public class Task_11 {
    public static void main(String[] args) {
        System.out.println("Задание №11");
        for (int i = 1; i <= 1000; i++) {
            String n = Integer.toString(i);
            String f = "";
            String b = "";
            String h = "";
            if (i % 3 == 0) {
                f = "Fizz";
            }
            if (i % 5 == 0) {
                b = "Buzz";
            }
            if (i % 15 == 0) {
                h = "Hiss";
            }
            System.out.println(n + f + b + h);
        }

    }
}
