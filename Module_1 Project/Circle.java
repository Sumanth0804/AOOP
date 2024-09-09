public class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public String render(RenderingMethod renderingMethod) {
        return renderingMethod.renderCircle(radius);
    }
}
