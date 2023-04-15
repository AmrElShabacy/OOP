public class Main {
    public static void main(String[] args) {
        Triangle t =new Triangle("Blue", true, 1 ,2 ,3);
        System.out.println(t.getPerimeter());
        System.out.println(t.getArea(2,3));
        System.out.println(t.getColor());
        System.out.println(t.isFilled());
    }
}