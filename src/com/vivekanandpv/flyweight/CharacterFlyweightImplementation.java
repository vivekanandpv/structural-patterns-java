package com.vivekanandpv.flyweight;

public class CharacterFlyweightImplementation implements CharacterFlyweight {
    private final int key;

    public CharacterFlyweightImplementation(int key) {
        this.key = key;
    }

    @Override
    public int getKey() {
        return key;
    }

    @Override
    public void draw(DrawingContext context) {
        System.out.printf("Printing {%d} using: %s%n", key, context);
    }
}
