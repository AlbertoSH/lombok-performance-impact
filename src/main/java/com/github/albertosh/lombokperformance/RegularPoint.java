package com.github.albertosh.lombokperformance;

public class RegularPoint extends java.lang.Record {

    private final int x;
    private final int y;

    public RegularPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    // getters, equals & hashcode and toString omitted for brevity
}
