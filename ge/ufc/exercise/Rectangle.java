package ge.ufc.exercises;

public class Rectangle extends Figure{

    private float height;
    private double weight;
    private static final float maxHeight;
    private static final double maxWeight;

    static {
        maxWeight = 50.0d;
        maxHeight = 50.0f;
    }

    public Rectangle(float height, double weight){
        super("Rectangle");
        this.height = height;
        this.weight = weight;
        if(this.height >= maxHeight) this.height = maxHeight;
        if(this.weight >= maxWeight) this.weight = maxWeight;
    }

    public Rectangle(){
        this(3 , 4);
    }

    public void setHeight(float height){
        this.height = height;
    }

    public float getHeight(){
        return this.height;
    }

    public void setWeight(float weight){
        this.weight = weight;
    }

    public double getWeight(){
        return this.weight;
    }


    @Override
    protected double perimeterCalculator(){
        return (this.weight + this.height) * 2;
    }

    @Override
    protected double areaCalculator(){
        return this.height * this.weight;
    }

    protected double perimeterCalculator(double height , double weight){
        return (weight + height) * 2;
    }

    protected double areaCalculator(double height , double weight){
        return height * weight;
    }

    public int compareTo(Rectangle rectangle){
        if(rectangle.areaCalculator() == this.areaCalculator() || rectangle == this) return 0;
        return rectangle.areaCalculator() > this.areaCalculator() ? 1 : -1;
    }
    public static Rectangle maxArea(Rectangle[] rect){
        Rectangle maxArea = rect[0];
        for (Rectangle rectangle : rect) {
            if(rectangle.areaCalculator() > maxArea.areaCalculator()){
                maxArea = rectangle;
            }
        }
        return maxArea;
    }

}
