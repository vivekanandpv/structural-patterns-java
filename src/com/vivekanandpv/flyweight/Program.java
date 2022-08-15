package com.vivekanandpv.flyweight;

public class Program {
    public static void main(String[] args) {
        CharacterFlyweightRegistry registry = new CharacterFlyweightRegistry();

        DrawingContext windowsContext = new WindowsDrawingContext(14, 52, 85);
        DrawingContext gnomeContext = new GnomeDrawingContext(85, 59, 5);

        CharacterFlyweight character1 = registry.getFlyweight(12);
        CharacterFlyweight character2 = registry.getFlyweight(23);
        CharacterFlyweight character3 = registry.getFlyweight(12);

        character1.draw(windowsContext);
        character2.draw(gnomeContext);
        character3.draw(gnomeContext);
    }
}
