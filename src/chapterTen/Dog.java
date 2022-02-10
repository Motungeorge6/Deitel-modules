package chapterTen;

import java.util.List;

public class Dog extends ClassB implements Movable {
    public void canNotRead(){
        System.out.println("Clearly!!!");
    }

    @Override
    public void move() {
        System.out.println("Dog walk");

    }
}
