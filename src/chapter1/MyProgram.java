package chapter1;

public class MyProgram {
    // 私有属性
    private int data;         // 整型属性
    private String str;       // 字符串属性

    // 设置整型属性的方法
    public void setData(int data) {
        this.data = data;
    }

    // 获取整型属性的方法
    public int getData() {
        return data;
    }

    // 设置字符串属性的方法
    public void setStr(String str) {
        this.str = str;
    }

    // 获取字符串属性的方法
    public String getStr() {
        return str;
    }

    // 将属性转换为字符串的方法
    @Override
    public String toString() {
        return "data: " + data + ", str: " + str;
    }

    // 主方法用于测试
    public static void main(String[] args) {
        MyProgram myProgram = new MyProgram();

        // 设置属性
        myProgram.setData(100);
        myProgram.setStr("Hello, World!");

        // 获取并显示属性
        System.out.println("获取的属性:");
        System.out.println("data: " + myProgram.getData());
        System.out.println("str: " + myProgram.getStr());

        // 调用 toString 方法显示属性
        System.out.println("toString 输出: " + myProgram.toString());
    }
}
