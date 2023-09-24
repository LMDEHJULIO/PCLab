package org.example;

public class Monitor {
    private Resolution resolution;
    private long modelNumber;
    private String manufacturerName;

    public void drawPixel(int x, int y, String color){
        System.out.println("Drawing pixel at " + x + "," + y + " " + "in color " + color);
    }

    public Monitor(Resolution res, long modelNumber, String manufacturerName){
        this.resolution = res;
        this.modelNumber = modelNumber;
        this.manufacturerName = manufacturerName;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "resolution=" + resolution +
                ", modelNumber=" + modelNumber +
                ", manufacturerName='" + manufacturerName + '\'' +
                '}';
    }
}
