public class Vector implements RenderingMethod {
    @Override
    public String renderCircle(double radius) {
        return "Rendering circle with vector graphics, radius: " + radius;
    }

    @Override
    public String renderSquare(double sideLength) {
        return "Rendering square with vector graphics, side length: " + sideLength;
    }
}
