package com.vivekanandpv.flyweight;

public class GnomeDrawingContext implements DrawingContext {
    private final int x;
    private final int y;
    private final int z;

    public GnomeDrawingContext(int x, int y, int z) {
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
        return "GnomeDrawingContext{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}
