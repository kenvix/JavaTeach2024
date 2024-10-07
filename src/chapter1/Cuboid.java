package chapter1;

public class Cuboid {
    private Rectangle rect; // 长方体的底面
    private double height;  // 长方体的高度

    // 构造方法
    public Cuboid(double width, double length, double height) {
        this.rect = new Rectangle();
        this.rect.setWidth(width);
        this.rect.setLength(length);
        this.height = height;
    }

    // 计算体积的方法
    public double getVolume() {
        return rect.getWidth() * rect.getLength() * height;
    }

    // 设置和获取底的宽度
    public double getBottomWidth() {
        return rect.getWidth();
    }

    public void setBottomWidth(double width) {
        rect.setWidth(width);
    }

    // 设置和获取底的长度
    public double getBottomLength() {
        return rect.getLength();
    }

    public void setBottomLength(double length) {
        rect.setLength(length);
    }

    // 获取柱形的高度
    public double getHeight() {
        return height;
    }

    // 设置柱形的高度
    public void setHeight(double height) {
        if (height > 0) {
            this.height = height;
        }
    }

    public static void main(String[] args) {
        // 创建一个 Cuboid 对象
        Cuboid cuboid = new Cuboid(4.0, 5.0, 10.0);

        // 输出底面的宽度和长度
        System.out.println("Bottom Width: " + cuboid.getBottomWidth());
        System.out.println("Bottom Length: " + cuboid.getBottomLength());

        // 输出柱形的高度
        System.out.println("Height: " + cuboid.getHeight());

        // 计算并输出体积
        System.out.println("Volume: " + cuboid.getVolume());

        // 修改底面的宽度和长度
        cuboid.setBottomWidth(6.0);
        cuboid.setBottomLength(8.0);

        // 修改柱形的高度
        cuboid.setHeight(12.0);

        // 输出更新后的数据
        System.out.println("Updated Bottom Width: " + cuboid.getBottomWidth());
        System.out.println("Updated Bottom Length: " + cuboid.getBottomLength());
        System.out.println("Updated Height: " + cuboid.getHeight());
        System.out.println("Updated Volume: " + cuboid.getVolume());
    }
}
