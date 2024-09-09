// Main.java

public class Main {
    public static void main(String[] args) {
        // Create shapes
        Circle circle = new Circle(5.0);
        Square square = new Square(4.0);

        // Create rendering methods
        Vector vector = new Vector();
        Raster raster = new Raster();

        // Render shapes using different rendering methods
        System.out.println("Rendering circle with vector graphics: " + circle.render(vector));
        System.out.println("Rendering circle with raster graphics: " + circle.render(raster));
        System.out.println("Rendering square with vector graphics: " + square.render(vector));
        System.out.println("Rendering square with raster graphics: " + square.render(raster));
    }
}
