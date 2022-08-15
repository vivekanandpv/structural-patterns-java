package com.vivekanandpv.composite;

public class InlineElement implements Element {
    @Override
    public void draw() {
        System.out.println("Inline element draws...");
    }

    @Override
    public void add(Element element) {
        throw new RuntimeException("Not available");
    }
}
