package prototype_pattern;

import java.util.HashMap;
import java.util.Map;

public class PrototypeManager {
    private final Map<String, Shape> shapeHolder = new HashMap<>();

    public PrototypeManager() {
        shapeHolder.put("Circle", new Circle());
        shapeHolder.put("Square", new Square());
    }

    public void addShape(String key, Shape obj) {
        shapeHolder.put(key, obj);
    }

    public Shape getShapeCopy(String key) {
        Shape temp = shapeHolder.get(key);
        return (Shape) temp.clone();
    }
}
