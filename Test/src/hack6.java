import java.util.Scanner;

public class hack6 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(N + " x " + i + " = " + N * i);
        }
    }
}