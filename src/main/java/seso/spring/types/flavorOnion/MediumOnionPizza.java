package seso.spring.types.flavorOnion;

import seso.spring.types.VegPizza;

public class MediumOnionPizza extends VegPizza {
    @Override
    public float price() {
        return 150.0f;
    }

    @Override
    public String name() {
        return "Onion Pizza";
    }

    @Override
    public String size() {
        return "Medium Size";
    }
}
