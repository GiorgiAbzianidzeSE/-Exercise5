package ge.ufc.exercises;

public class Main {
    public static void main(String[] args) {
        //Task 2
        Figure figure = new Rectangle();//იმისათვის რომ გადასაზღვრული მეთოდი გამოვიძახოთ საჭიროა შვილის ობიექტი, წინააღმდეგ შემთხვევაში შვილ კლასში გადასაზღვრულ მეთოდს ვერ მივწვდებით
        Rectangle rectangle = new Rectangle();
        System.out.println(figure.areaCalculator());
        System.out.println(rectangle.areaCalculator());

        //Task 3
        System.out.println(new Rectangle() instanceof Figure);//True
        System.out.println(new Figure("") instanceof Rectangle);//False
        System.out.println(new Rectangle() instanceof Rectangle);//True
        System.out.println(new Figure("") instanceof Figure);//True

        //Task 5
        System.out.println(new Rectangle().perimeterCalculator(4,5));
        System.out.println(new Rectangle().areaCalculator(4,5));
    }
}
