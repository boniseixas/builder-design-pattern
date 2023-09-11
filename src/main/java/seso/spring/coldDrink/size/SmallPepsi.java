package seso.spring.coldDrink.size;

import seso.spring.coldDrink.Pepsi;

public class SmallPepsi extends Pepsi {
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
