package org.example;

public class Resolution {
    private int width;
    private int height;


    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public Resolution(int width, int height){
            this.width = width;
            this.height = height;
    }

    @Override

    public String toString(){
        return "Resolution is: " + width + " by " + height;
    }
}
