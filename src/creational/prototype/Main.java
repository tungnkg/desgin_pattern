package creational.prototype;

public class Main {
    public static void main(String[] args) {
        // Create initial shapes
        Circle originalCircle = new Circle("Red", 10);
        Rectangle originalRectangle = new Rectangle("Blue", 20, 30);

        // Clone the shapes
        Shape clonedCircle = originalCircle.clone();
        Shape clonedRectangle = originalRectangle.clone();

        // Draw original and cloned shapes
        System.out.println("Original Shapes:");
        originalCircle.draw();
        originalRectangle.draw();

        System.out.println("\nCloned Shapes:");
        clonedCircle.draw();
        clonedRectangle.draw();

        // Modify cloned shape to show independence
        if (clonedCircle instanceof Circle modifiedCircle) {
            modifiedCircle.setColor("Green");
            modifiedCircle.setRadius(15);
            modifiedCircle.draw();
        }
    }
}
