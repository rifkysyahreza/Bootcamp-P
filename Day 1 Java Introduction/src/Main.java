public class Main {
    public static void main(String[] args) {
        // Solution One
        RectangleArea rectangleOne =  new RectangleArea(5,3);
        double rectangleOneCalc = rectangleOne.calc();
        System.out.println("Rectangle area: " + rectangleOneCalc );
        System.out.println("");

        // Solution Two
        double circleCalcDiameter = CircleDiameterAreaCircumference.calcDiameter(5);
        System.out.println("Circle diameter: " + circleCalcDiameter );
        double circleCalcArea = CircleDiameterAreaCircumference.calcArea(5);
        System.out.println("Circle area: " + circleCalcArea );
        double circleCalcCircumference = CircleDiameterAreaCircumference.calcCircumference(5);
        System.out.println("Circle circumference: " + circleCalcCircumference );
        System.out.println("");

        // Solution Three
        AngleTriangle nonStaticTriangleAngle = new AngleTriangle();
        int angleTriangle = nonStaticTriangleAngle.calc(80,65);
        System.out.println("Third angle: " + angleTriangle );
        System.out.println("");

        // Solution Four
        int differentDates = DifferentDates.calc("2024-03-19", "2024-03-21");
        System.out.println("Dates difference: " + differentDates );
        System.out.println("");

        // Solution Five
        NameInitial.execute("John Doe");
    }
}