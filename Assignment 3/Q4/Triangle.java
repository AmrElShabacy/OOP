public class Triangle extends GeometricObject {
    private int side1;
    private int side2;
    private int side3;
    public Triangle(){}
    public Triangle(String color, boolean filled , int a, int b,int c ){
        super(color, filled);
        this.side1 =a;
        this.side2 =b;
        this.side3 =c;
    }
    public double getArea(int b, int h){
        return b*h;
    }
    public double getPerimeter(){
        return this.side1+this.side2+this.side3;
    }
}
