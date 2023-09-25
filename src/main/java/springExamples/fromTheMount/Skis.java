package springExamples.fromTheMount;

public class Skis implements Inventory {

    @Override
    public boolean isSkis() {
        return true;
    }

    @Override
    public String name() {
        return "Спутник-1";
    }

    @Override
    public String cost() {
        return "3000руб";
    }
}
