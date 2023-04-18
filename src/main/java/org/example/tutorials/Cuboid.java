package org.example.tutorials;

public class Cuboid {
    int height;
    int width;
    int depth;

    Cuboid(int width, int height, int depth){
        this.depth = depth;
        this.width = width;
        this.height = height;
    }

    Cuboid(int width, int height){
        this.width = width;
        this.height = height;
        this.depth = 10;
    }

    Cuboid(int dimension){
        this.width = dimension;
        this.height = dimension;
        this.depth = dimension;
    }

    Cuboid(){
        this.depth = 10;
        this.height = 10;
        this.width = 10;
    }


    private int getHeight() {
        return this.height;
    }
    private int getWidth() {
        return this.width;
    }
    private int getDepth() {
        return this.depth;
    }

    private void setHeight(int height){
        this.height = height;
    }

    private void setWidth(int width){
        this.width = width;
    }

    private void setDepth(int depth){
        this.depth = depth;
    }

    int Volume(){
        return (getHeight() * getDepth() * getWidth());
    }

    @Override
    public String toString() {
        return "Cuboid{" +
                "height=" + height +
                ", width=" + width +
                ", depth=" + depth +
                '}';
    }
}
