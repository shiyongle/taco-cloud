package sla.tacocloud.tacos;

/**
 * @Author: Richered
 * @Date: 2020/09/18 11:38
 * @Description:
 **/

public class Ingredient {

    private final String id;

    private final String name;

    private final Type type;

    public Ingredient(String id, String name, Type type) {
        this.id = id;
        this.name = name;
        this.type = type;
    }

    public static enum Type{
        WRAP, PROTEIN, VEGGIES, CHEESE, SAUSE,
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Type getType() {
        return type;
    }
}
