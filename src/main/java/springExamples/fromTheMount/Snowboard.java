package springExamples.fromTheMount;

public class Snowboard implements Inventory {

    @Override
    public boolean isSkis() {
        return false;
    }

    @Override
    public String name() {
        return "New_balance_4500X";
    }

    @Override
    public String cost() {
        return "3000$";
    }
}
