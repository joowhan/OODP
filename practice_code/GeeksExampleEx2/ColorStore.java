import java.util.HashMap;
import java.util.Map;
class ColorStore {

    private static Map<String, Color> colorMap = new HashMap<String, Color>();

    static
    {
        Color originalBlue = new blueColor();
        colorMap.put("blue", originalBlue);
        System.out.println("Original blue Object "+ originalBlue.hashCode());
        colorMap.put("black", new blackColor());
    }

    public static Color getColor(String colorName)
    {
        return (Color) colorMap.get(colorName).clone();
    }
}
