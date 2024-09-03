public class CircleDiameterAreaCircumference {

    public static double calcDiameter(double radius){
        return radius*2;
    }

    public static double calcArea(double radius){
        double phi = 3.14;
        return phi*(radius*radius);
    }

    public static double calcCircumference(double radius){
        double phi = 3.14;
        return 2*phi*radius;
    }
}
