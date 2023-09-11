package seso.spring.coldDrink.size;

import seso.spring.coldDrink.Coke;

public class LargeCoke extends Coke {
    @Override
    public String name() {
        return "750 ml Pepsi";
    }

    @Override
    public String size() {
        return "Large Pepsi";
    }

    @Override
    public float price() {
        return 50.0f;
    }
}
