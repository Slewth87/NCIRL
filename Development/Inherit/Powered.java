public class Powered extends Character{
    //vars
    private String ability, stance;
    //methods
    public void setAbility(String choice){
        if (choice.equalsIgnoreCase("physical")) {
            ability = "with their fists.";
        } else if (choice.equalsIgnoreCase("super")){
            ability = "with their eyebeams.";
        } else if (choice.equalsIgnoreCase("mystical")){
            ability = "with a magic blast.";
        }
    }
    public String getStance(){
        stance = getDemeanour()+"ly";
        return stance;
    }
    public String getAbility(){
        return ability;
    }
}