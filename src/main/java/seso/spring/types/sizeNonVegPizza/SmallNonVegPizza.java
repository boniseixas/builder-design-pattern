package seso.spring.types.sizeNonVegPizza;

import seso.spring.types.NonVegPizza;

public class SmallNonVegPizza extends NonVegPizza {
    @Override
    public float price() {
        return 180.0f;
    }

    @Override
    public String name() {
        return "Non-Veg Pizza";
    }

    @Override
    public String size() {
        return "Small Size";
    }
}
