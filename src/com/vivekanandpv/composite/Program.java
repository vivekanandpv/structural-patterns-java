package com.vivekanandpv.composite;

public class Program {
    public static void main(String[] args) {
        Element p = new InlineElement();
        Element h1 = new InlineElement();
        Element table = new BlockElement();
        table.add(new InlineElement());
        table.add(new InlineElement());

        p.draw();
        h1.draw();
        table.draw();
    }
}
