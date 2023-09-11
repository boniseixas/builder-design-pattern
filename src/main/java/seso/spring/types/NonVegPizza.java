package seso.spring.types;

import seso.spring.model.Pizza;

public abstract class NonVegPizza extends Pizza {
    @Override
    public abstract float price();
    @Override
    public abstract String name();
    @Override
    public abstract  String size();
}
