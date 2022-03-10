public class Character{
    //vars
    private String name, demeanour;
    
    //methods
    public Character(){
        name = "a bystander";
        demeanour = "neutral";
    }

    //set
    public void setName(String name){
        this.name = name;
    }
    public void setDemeanour(String demeanour){
        this.demeanour = demeanour;
    }
    //get
    public String getName(){
        return name;
    }
    public String getDemeanour(){
        return demeanour;
    }
}