abstract public class Shape {
    abstract void Drawe();

}
class Rectangle extends Shape {
    @Override
    void Drawe() {
        System.out.println("Drawing Rectangle");
    }
}
class Triangle extends Shape {
    @Override
    void Drawe() {
        System.out.println("Drawing Triangle");
    }
}
class Test {
    public static void main(String[] args) {
        Shape s = new Rectangle();
        Shape s1 = new Triangle();
        s.Drawe();
        s1.Drawe();
    }
}
