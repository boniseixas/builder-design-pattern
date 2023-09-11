package seso.spring.coldDrink.size;

import seso.spring.coldDrink.Coke;

public class SmallCoke extends Coke {
    @Override
    public String name() {
        return "300 ml Pepsi";
    }

    @Override
    public float price() {
        return 25.0f;
    }

    @Override
    public String size() {
        return "Small Size";
    }
}
