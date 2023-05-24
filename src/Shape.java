abstract class Shape {
    abstract void draw();
}
class Rectangle extends Shape{
    @Override
    void draw() {
        System.out.println("Draw rectangle!");
    }
}
class Circle extends Rectangle{
    @Override
    void draw() {
        System.out.println("Draw circle!");
    }

}
class Test{
    public static void main(String[] args) {
        Shape s = new Rectangle();
        s.draw();
        Shape s1 = new Circle();
        s1.draw();
    }
}