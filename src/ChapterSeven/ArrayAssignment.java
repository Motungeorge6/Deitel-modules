package ChapterSeven;

public class ArrayAssignment {
    public static void main(String[] args) {
        String[][]array ={{ "Name", "Address", "Sex"},{"Joel","7,Oyewale Street", "Male"}};
        displayArray(array);
    }
    public static void displayArray(String[][] array){
        for (String[] strings : array){
            for (String string : strings){
                System.out.println(string);
            }
            System.out.println(" ");
        }
    }
}
