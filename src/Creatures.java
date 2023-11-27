public class Creatures {
    private CreatureInfo identity;

    public Creatures(CreatureInfo ci){
    this.identity=ci;
    }
    public boolean isStronger(String E){
    if(identity.getType()=="Fire"&& E == "Grass"){
        return true;
    }
    else if(identity.getType()=="Water"&& E == "Fire"){
            return true;
    }
    else if(identity.getType()=="Grass"&& E == "Water"){
        return true;
    }
    else return false;
    }
    public CreatureInfo getIdentity() {
        return identity;
    }
}
