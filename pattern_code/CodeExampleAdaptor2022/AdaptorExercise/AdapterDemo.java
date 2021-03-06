class LegacyLine {
    public void draw(int x1, int y1, int x2, int y2) {
        System.out.println("line from (" + x1 + ',' + y1 + ") to (" + x2 + ','
          + y2 + ')');
    }
}

class LegacyRectangle {
    public void draw(int x, int y, int w, int h) {
        System.out.println("rectangle at (" + x + ',' + y + ") with width " + w
          + " and height " + h);
    }
}
public class AdapterDemo {
    public static void main(String[] args) {
        Object[] shapes = {
            new LegacyLine(), new LegacyRectangle()
        };

        int x1 = 10, y1 = 20;
        int x2 = 30, y2 = 60;

        for (Object obj : shapes) {
            if (LegacyLine.class.isInstance(obj)) {
                LegacyLine.class.cast(obj).draw(x1, y1, x2, y2);
            } else if (LegacyRectangle.class.isInstance(obj)) {
              LegacyRectangle.class.cast(obj).draw(Math.min(x1, x2), Math.min(y1, y2),
                  Math.abs(x2 - x1), Math.abs(y2 - y1));
            }
        }
    }
}
