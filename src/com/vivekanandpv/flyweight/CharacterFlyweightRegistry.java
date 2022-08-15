package com.vivekanandpv.flyweight;

import java.util.HashMap;
import java.util.Map;

public class CharacterFlyweightRegistry {
    private final Map<Integer, CharacterFlyweight> flyweights;


    public CharacterFlyweightRegistry() {
        this.flyweights = new HashMap<>();
    }

    public CharacterFlyweight getFlyweight(int key) {
        if (flyweights.containsKey(key)) {
            return flyweights.get(key);
        }

        CharacterFlyweight flyweight = new CharacterFlyweightImplementation(key);
        flyweights.put(key, flyweight);
        return flyweight;
    }
}
