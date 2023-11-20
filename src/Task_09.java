import com.sun.jdi.request.BreakpointRequest;

public class Task_09 {

    public static void main(String[] args) {
        System.out.println("Задание №9");
        System.out.println(Compute());

    }

    public static int Compute() {
        int sum = 0;
        for (int i = 1; i <= 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        return sum;

    }
}

