import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BMICalculatorTest {

    @Test
    public void testBMICalculation() {
        double weight = 70; // in kg
        double height = 1.75; // in meters
        double expectedBMI = 22.86;
        double actualBMI = BMICalculator.calculateBMI(weight, height);
        assertEquals(expectedBMI, actualBMI, 0.01);
    }

    @Test
    public void testBMICategoryDetermination() {
        double underweightBMI = 18.0;
        double normalBMI = 22.0;
        double overweightBMI = 27.0;
        double obeseBMI = 32.0;

        assertEquals(BMICalculator.BMICategory.UNDERWEIGHT, BMICalculator.determineBMICategory(underweightBMI));
        assertEquals(BMICalculator.BMICategory.NORMAL, BMICalculator.determineBMICategory(normalBMI));
        assertEquals(BMICalculator.BMICategory.OVERWEIGHT, BMICalculator.determineBMICategory(overweightBMI));
        assertEquals(BMICalculator.BMICategory.OBESE, BMICalculator.determineBMICategory(obeseBMI));
    }

    @Test
    public void testInvalidInput() {
        double weight = 0;
        double height = 1.75;
        try {
            BMICalculator.calculateBMI(weight, height);
        } catch (IllegalArgumentException e) {
            assertEquals("Weight and height must be positive numbers", e.getMessage());
        }
    }
}
