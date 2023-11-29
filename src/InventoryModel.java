package GuiMCO;

import java.util.ArrayList;

public class InventoryModel {

    private Inventory inventory;;
    private ArrayList<Creatures> list = new ArrayList<>();

    public InventoryModel(Inventory inventory){

        this.inventory = inventory;
        list = inventory.getCreaturelist();

    }
    
    public ArrayList<Creatures> getInventory() {

        return list;

    }

    
}
