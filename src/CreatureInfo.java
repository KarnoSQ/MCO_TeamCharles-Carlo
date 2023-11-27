public class CreatureInfo {
    private final char Family;
    private final String Name;
    private final String Type;
    private final int Evo;

    public CreatureInfo (String name,String type,int evo,char family){
        this.Name = name;
        this.Type=type;
        this.Family=family;
        this.Evo=evo;
    }

    public char getFamily() {
        return Family;
    }

    public String getName() {
        return Name;
    }

    public int getEvo() {
        return Evo;
    }

    public String getType() {
        return Type;
    }
}
