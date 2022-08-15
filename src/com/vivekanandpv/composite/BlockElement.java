package com.vivekanandpv.composite;

import java.util.ArrayList;
import java.util.List;

public class BlockElement implements Element {
    private List<Element> elements = new ArrayList<>();

    @Override
    public void draw() {
        System.out.println("Block element draws...");

        for (Element element : elements) {
            element.draw();
        }
    }

    @Override
    public void add(Element element) {
        elements.add(element);
    }
}
