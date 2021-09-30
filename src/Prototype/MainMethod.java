package Prototype;

public class MainMethod {
    public static void main(String[] args) {
        PrototypeManager manager = new PrototypeManager();

        Shape shape1 = manager.getShapeCopy("Circle");
        shape1.countArea();

        Shape shape2 = manager.getShapeCopy("Square");
        shape2.countArea();
    }
}
