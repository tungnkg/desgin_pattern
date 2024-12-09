package creational.prototype;

public class Rectangle implements Shape {
    private String color;
    private int width;
    private int height;

    public Rectangle(Rectangle target) {
        this.color = target.color;
        this.width = target.width;
        this.height = target.height;
    }

    public Rectangle(String color, int width, int height) {
        this.color = color;
        this.width = width;
        this.height = height;
    }

    @Override
    public Shape clone() {
        return new Rectangle(this);
    }

    @Override
    public void draw() {
        System.out.println("Drawing a " + color + " rectangle with width " + width + " and height " + height);
    }

    // Getters and setters
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
