package SweetXmas;
import java.util.Scanner;
public class ArrayPractice {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] getInteger = new int[0][];
        int[] myInteger = getInteger[10];
        for (int i = 0; i <= myInteger.length; i++) {
            System.out.println("Element" + i + "typed value was" + myInteger[i]);
        }
    }

    public static int[] getInteger(int number) {
        System.out.println("Enter" + number + "integer values.\r");
        int[] values = new int[number];

        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }
        return values;

    }
}

