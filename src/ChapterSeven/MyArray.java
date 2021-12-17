package ChapterSeven;

public class MyArray {
    public static void main(String[] args) {
        int[] Myvariable = new int[25];
        // Myvariable[0] =10;
        //  Myvariable[1] = 45;
        // Myvariable[5] = 456;
        for (int i = 0; i < Myvariable.length; i++) {
            Myvariable[i] = i * 20;
        }
        printArray(Myvariable);

    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(" Element " + i + " value is " + array[i]);


        }
    }
}

