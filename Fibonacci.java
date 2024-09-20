import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe um número para verificar se pertence à sequência de Fibonacci: ");
        int num = sc.nextInt();
        sc.close();

        if (isFibonacci(num)) {
            System.out.println(num + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(num + " não pertence à sequência de Fibonacci.");
        }
    }

    public static boolean isFibonacci(int num) {
        int a = 0, b = 1, temp;
        while (a < num) {
            temp = a + b;
            a = b;
            b = temp;
        }
        return a == num;
    }
}
