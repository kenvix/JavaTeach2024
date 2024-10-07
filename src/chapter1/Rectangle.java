package chapter1;

public class Rectangle {
    double width, length;

    public void setWidth(double w) {
        if (w > 0)
            this.width = w;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double h) {
        if (h > 0)
            this.length = h;
    }

    public double getLength() {
        return length;
    }
}
