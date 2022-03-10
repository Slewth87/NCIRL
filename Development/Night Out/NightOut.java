public class NightOut{
    //vars
    private String venue, prog;
    private int year;
    //constructor
    NightOut(){
        venue="Harbourmaster";
        prog="HDAIML";
        year=1;
    }
    //set
    public void setYear (int year){
        this.year=year;
    }
    public void setProg (String prog){
        this.prog=prog;
    }
    //compute
    public void calculate(){
        if ((year==1 && prog.equalsIgnoreCase("HDAIML")) || (year==2 && prog.equalsIgnoreCase("HDBC"))){
            venue="Lagoona";
        } else if ((year==2 && prog.equalsIgnoreCase("HDAIML")) || (year==1 && prog.equalsIgnoreCase("HDBC"))){
                venue="Harbourmaster";
        } else {
            venue="Go Home, Roger!";
        }
    }
    //get
    public String getVenue(){
        return venue;
    }
}