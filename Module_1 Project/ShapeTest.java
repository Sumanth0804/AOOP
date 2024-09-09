import org.junit.Test;
import static org.junit.Assert.*;

public class ShapeTest {
    @Test
    public void testCircleRenderVector() {
        Circle circle = new Circle(5.0);
        Vector vector = new Vector();
        String result = circle.render(vector);
        assertEquals("Rendering circle with vector graphics, radius: 5.0", result);
    }

    @Test
    public void testSquareRenderRaster() {
        Square square = new Square(4.0);
        Raster raster = new Raster();
        String result = square.render(raster);
        assertEquals("Rendering square with raster graphics, side length: 4.0", result);
    }
}
