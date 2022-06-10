package com.mitu.Games;

public class Card {
    private String size;
    private String color;
    private int index;

    public Card(String color, String size, int index) {
        this.size = size;
        this.color = color;
        this.index = index;
    }


    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    @Override
    public String toString() {
        return color + size;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}
