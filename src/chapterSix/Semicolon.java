package chapterSix;
import java.util.Scanner;
public class Semicolon {
    public static void main(String[] args) {
        System.out.println("Enter name");
        Scanner input= new Scanner(System.in);
        String name = input.next();
        System.out.println("Input scv number");
        int scvNumber = input.nextInt();


        Native aNative = new Native(name, scvNumber);
        System.out.println(aNative.getName());
        System.out.println(aNative.getScvId());

    }
}
