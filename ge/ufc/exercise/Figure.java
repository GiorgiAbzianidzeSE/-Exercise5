package ge.ufc.exercises;

public class Figure {

    public Figure(String parameter){
        System.out.println(parameter);
    }
    public final static void sayHello(){
        System.out.println("Hello Random Figure");
    }
    protected double perimeterCalculator(){
        return -1;
    }
    protected double areaCalculator(){
        return -1;
    }
}
