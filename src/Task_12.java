import java.util.Scanner;

public class Task_12 {
    public static void main(String[] args) {
        System.out.println("Задание №12");
        Scanner input = new Scanner(System.in);
        double dist = 0;
        double x;
        double y;
        int days = 0;
        System.out.print("Enter x: ");
        x = input.nextDouble();
        System.out.print("Enter y: ");
        y = input.nextDouble();
        while (dist < y) {
            dist += x;
            x *= 1.1;
            days++;
        }
        System.out.println(days + " days");


    }
}
