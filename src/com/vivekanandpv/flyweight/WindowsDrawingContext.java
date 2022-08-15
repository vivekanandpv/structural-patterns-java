package com.vivekanandpv.flyweight;

public class WindowsDrawingContext implements DrawingContext {
    private final int x;
    private final int y;
    private final int z;

    public WindowsDrawingContext(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public int getX() {
        return x;
    }

    @Override
    public int getY() {
        return y;
    }

    @Override
    public int getZ() {
        return z;
    }

    @Override
    public String toString() {
        return "WindowsDrawingContext{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}
