public class Main
{
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setHeight(20);
        rectangle.setWidth(30);
        System.out.println(rectangle.area());

        Square square = new Square();
        square.setSize(20);
        System.out.println(square.area());
    }
}