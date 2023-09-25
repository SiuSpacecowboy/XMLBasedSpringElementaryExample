package springExamples.fromTheMount;

import java.util.ArrayList;
import java.util.List;

public class FromMount {

    private List<Inventory> inventories = new ArrayList<>();
    private String name;
    private int high;

    public FromMount() {}

    public FromMount(List<Inventory> inventories) {
        this.inventories = inventories;
    }

   public List<Inventory> getInventories() {
        return inventories;
    }

    public void setInventories(List<Inventory> inventories) {
        this.inventories = inventories;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHigh() {
        return high;
    }

    public void setHigh(int high) {
        this.high = high;
    }
    public void ride() {
        for (Inventory inv : inventories) {
            System.out.println("На чем спускаешься, лыжи? " + inv.isSkis() + "\n"
                    + "Название: " + inv.name() + "\n"
                    + "А стоит сколько это добро? " + inv.cost());
        }
    }
}
