package creational.prototype;

public class Circle implements Shape{
    private String color;
    private int radius;

    // Constructor
    public Circle(String color, int radius) {
        this.color = color;
        this.radius = radius;
    }

    // Copy constructor (used for cloning)
    public Circle(Circle target) {
        this.color = target.color;
        this.radius = target.radius;
    }

    @Override
    public Shape clone() {
        // Using copy constructor instead of Object's clone method
        return new Circle(this);
    }

    @Override
    public void draw() {
        System.out.println("Drawing a " + color + " circle with radius " + radius);
    }

    // Getters and setters
    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }
    public int getRadius() { return radius; }
    public void setRadius(int radius) { this.radius = radius; }
}
