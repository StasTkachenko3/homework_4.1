import java.util.Scanner;

public class Task_05 {
    public static boolean isPalindrome(int number){
        int originalNumber = number;
        int reversedNumber = 0;
        while (number != 0){
            int digit  = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }
        return originalNumber == reversedNumber;

    }
    public static void main(String[] args) {
        System.out.println("Задание №5");
        Scanner sc= new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = sc.nextInt();
        if (isPalindrome(number)){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}
