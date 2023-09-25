package springExamples.fromTheMount;

public class Skates implements Inventory {


    @Override
    public boolean isSkis() {
        return false;
    }

    @Override
    public String name() {
        return "Лезвие";
    }

    @Override
    public String cost() {
        return "300$";
    }
}
