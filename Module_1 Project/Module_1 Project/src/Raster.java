public class Raster implements RenderingMethod {
    @Override
    public String renderCircle(double radius) {
        return "Rendering circle with raster graphics, radius: " + radius;
    }

    @Override
    public String renderSquare(double sideLength) {
        return "Rendering square with raster graphics, side length: " + sideLength;
    }
}
