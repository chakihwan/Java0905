package ex11;

public class Cylinder {
    private int radius;
    private int height;

    public int getRadius() {
        return radius;
    }

    public int getHeight() {
        return height;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getVolume(){
        return radius * radius * Math.PI * height;
//        return Math.PI * Math.pow(radius, 2) * height;
    }
    public double getSurfaceArea(){
        double circleArea = Math.PI * radius * radius;
        double rectangleArea = height * 2 * Math.PI * radius;
        return 2 * circleArea + rectangleArea;
    }
}
