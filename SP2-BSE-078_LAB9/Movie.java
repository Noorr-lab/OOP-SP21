package com.company;
public class Movie{
    private String rating;
    private int ID;
    private String title;
    private int NoOfDays;
    public Movie(String r, int id, String t, int d){
        rating = r;
        ID = id;
        title = t;
        NoOfDays = d;
    }
    public void setRating(String r) {
       rating = r;
    }
    public String getRating() {
        return rating;
    }
    public void setID(int id){
        id = ID;
    }
    public int getID() {
        return ID;
    }
    public void setTitle(String t){
        title = t;
    }
    public String getTitle(){
        return title;
    }
    public void setNoOfDays(int d){
        NoOfDays = d;
    }
    public int getNoOfDays() {
        return NoOfDays;
    }
    public boolean equals(Object O){
        if(O == null)
            return false;
        else if(getClass() != O.getClass())
            return false;
        else {
            Movie m = (Movie) O;
            return (rating.equals(m.rating) && ID == m.ID
                    && title.equals(m.title) && NoOfDays == m.NoOfDays);
        }
    }
    public double calcLateFees(int NoOfDays){
        return 2*NoOfDays;
    }
    public String toString(){
        return "\nMPAA Rating: " + rating + "\nID Number: " + ID
                + "\nMovie Title: " + title + "\nNumber of days:" + NoOfDays;
    }
}
