package chapterTen;

public class Human extends ClassAB implements Movable,Flyable{
    public void read(){
        System.out.println("I can read");
    }

    @Override
    public void move() {

    }
    @Override
    public void fly(){
        System.out.println("I am going higher yes i am...");
    }

    @Override
    public void wake() {
        System.out.println("I no wan wake");
    }
}
