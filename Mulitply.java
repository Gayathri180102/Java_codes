import java.util.Scanner;

public class Mulitply {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the arrays: ");
        int length = scanner.nextInt();

        int array1[] = new int[length];
        int array2[] = new int[length];
        int result[] = new int[length];

        System.out.println("Enter elements for the first array:");
        for (int i = 0; i < length; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array1[i] = scanner.nextInt();
        }

        System.out.println("Enter elements for the second array:");
        for (int i = 0; i < length; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array2[i] = scanner.nextInt();
        }

        for (int i = 0; i < length; i++) {
            result[i] = array1[i] * array2[i];
        }

        System.out.print("Result of array multiplication: ");
        for (int i = 0; i < length; i++) {
            System.out.print(result[i] + " ");
        }

        scanner.close();
    }
}

