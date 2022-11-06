import java.util.Scanner;

public class Task_7_53 {

    public static void main(String[] args) {
        findMaximumIndex();
    }

    private static void findMaximumIndex() {
        Scanner scanner = createScanner();
        int n = getN(scanner);
        int[] numbers = initializeArray(scanner, n);
        int index = getIndex(n, numbers);
        printAnswer(index);
    }

    private static void printAnswer(int index) {
        System.out.println("Index of element with maximum value is: " + index);
    }

    private static Scanner createScanner() {
        return new Scanner(System.in);
    }

    private static int getN(Scanner scanner) {
        System.out.print("Enter n: ");
        return scanner.nextInt();
    }

    private static int[] initializeArray(Scanner scanner, int n) {
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter a[" + (i + 1) + "]: ");
            numbers[i] = scanner.nextInt();
        }
        return numbers;
    }

    private static int getIndex(int n, int[] numbers) {
        int max = Integer.MIN_VALUE;
        int index = -1;
        for (int i = 0; i < n; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
                index = (i + 1);
            }
        }
        return index;
    }
}
