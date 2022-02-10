package chapterEight;

import java.time.LocalDate;

public enum FavouriteDay {
    HBD("Buyday","Lokoja",LocalDate.of(2015, 3, 32) ),
    DD("Kick-Bucket Day", "Where i die", LocalDate.of(8035,3, 31)),
    WD("Wedding Day", "Shrine", LocalDate.of(8032, 1, 1)),
     LD("Lenny's Death", "Where she dies", LocalDate.of(8033, 1, 31));



    private final String name;
    private final String placeOfOccurence;
    private final LocalDate date;

    FavouriteDay(String name,String place,LocalDate date){
        this.name = name;
        placeOfOccurence = place;
        this.date = date;
    }
    public String getName(){
        return name;
    }
    public String getPlaceOfOccurence(){
        return placeOfOccurence;
    }
    public LocalDate getDate(){
        return getDate();
    }

}
