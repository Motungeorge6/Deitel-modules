package chapterEight;

public class Beverage {

    private int cocoaQty;
    private int sugarQty;
    private  int milkQty;

    public int getCocoaQty(){
        return cocoaQty;
    }
    public int getSugarQty(){
        return sugarQty;
    }
    public int getMilkQty(){
        return milkQty;
    }

    public void setCocoaQty(int cocoaQty) {
        this.cocoaQty = cocoaQty;
    }

    public void setSugarQty(int sugarQty) {
        this.sugarQty = sugarQty;
    }

    public void setMilkQty(int milkQty) {
        this.milkQty = milkQty;
    }
    public Beverage(){
        this.sugarQty = 5;
    }
    public Beverage(int cocoaQty,int sugarQty,int milkQty){
        this.cocoaQty = milkQty;
        this.sugarQty = sugarQty * 2;
        this.milkQty = cocoaQty;
    }
    public Beverage(int milkQty){
        this.milkQty = milkQty;

    }
    public Beverage(int cocoaQty,int milkQty){
        this.cocoaQty = cocoaQty;
        this.milkQty = milkQty;
    }
}
