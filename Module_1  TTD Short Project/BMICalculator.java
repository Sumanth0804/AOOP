public class BMICalculator {

    public enum BMICategory {
        UNDERWEIGHT("Underweight"),
        NORMAL("Normal"),
        OVERWEIGHT("Overweight"),
        OBESE("Obese");

        private final String label;

        BMICategory(String label) {
            this.label = label;
        }

        public String getLabel() {
            return label;
        }
    }

    public static double calculateBMI(double weight, double height) {
        if (weight <= 0 || height <= 0) {
            throw new IllegalArgumentException("Weight and height must be positive numbers");
        }
        return weight / Math.pow(height, 2);
    }

    public static BMICategory determineBMICategory(double bmi) {
        if (bmi < 18.5) {
            return BMICategory.UNDERWEIGHT;
        } else if (bmi < 25) {
            return BMICategory.NORMAL;
        } else if (bmi < 30) {
            return BMICategory.OVERWEIGHT;
        } else {
            return BMICategory.OBESE;
        }
    }

    public static void main(String[] args) {
        double weight = 70; // in kg
        double height = 1.75; // in meters
        double bmi = calculateBMI(weight, height);
        BMICategory category = determineBMICategory(bmi);
        System.out.println("BMI: " + bmi);
        System.out.println("Category: " + category.getLabel());
    }
}
