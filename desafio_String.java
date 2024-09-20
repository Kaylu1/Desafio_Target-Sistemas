import java.util.Scanner;

public class desafio_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma string: ");
        String input = sc.nextLine();

        int count = contarLetraA(input);
        System.out.println("A letra 'a' aparece " + count + " vezes na string.");
    }

    public static int contarLetraA(String str) {
        int count = 0;
        for (char c : str.toLowerCase().toCharArray()) {
            if (c == 'a') {
                count++;
            }
        }
        return count;
    }
}
