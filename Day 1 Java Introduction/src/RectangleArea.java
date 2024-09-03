public class RectangleArea {
    private double width;
    private double height;

    public RectangleArea(double width, double height){
        this.width = width;
        this.height = height;
    }

    public double calc(){
        return width * height;
    }
}
