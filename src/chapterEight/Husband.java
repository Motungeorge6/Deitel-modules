package chapterEight;

public class Husband {
    private Wife iyawo;

    public Husband(Wife wife){
        iyawo = wife;
    }
public void askWifeToCook(String cookWhat){
    System.out.println("Begging my wife to cook");
    switch (cookWhat){
        case "Indomie":
            System.out.println("Get lost");
            break;
        default:iyawo.cook();
    }

}
   // public Wife getIyawo() {
     //   return iyawo;
    }

    //public void setIyawo(Wife folaWife, Wife iyawo) {
      //  this.iyawo = iyawo;
 //   }
//}

