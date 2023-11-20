public class Task_04 {
    public static void main(String[] args) {
        System.out.println("Задание №4");
        System.out.println("Cовершенные числа в диапазоне от 0 до 1_000_000");
        for (int i = 0; i <= 1_000_000 ; i++) {
            if (isPefrectNumber(i)){
                System.out.println(i);
            }

        }
    }
    public static boolean isPefrectNumber (int number){
        int sum = 0;
        for (int i = 1; i < number ; i++) {
            if (number % i == 0){
                sum += i;
            }

        }
        return sum == number;
    }
}
