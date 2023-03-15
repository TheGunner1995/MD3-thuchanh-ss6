public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);
        shape = new Shape("red", false);
        System.out.println(shape);

        System.out.println("-------CIRCLE-------");
        Circle circle = new Circle();
        System.out.println(circle);
        circle = new Circle(3.5);
        System.out.println(circle);
        circle = new Circle(3.5, "indigo", false);
        System.out.println(circle);

        System.out.println("-------RECTANLE-------");
        Rectangle rectangle =new Rectangle();
        System.out.println(rectangle);
        rectangle = new Rectangle(2.5,3.5);
        System.out.println(rectangle);
        rectangle = new Rectangle(2.5,3.5,"orange",true);
        System.out.println(rectangle);

    }

}