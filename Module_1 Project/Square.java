public class Square implements Shape {
    private double sideLength;

    public Square(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public String render(RenderingMethod renderingMethod) {
        return renderingMethod.renderSquare(sideLength);
    }
}
