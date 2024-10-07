package chapter1;

public class Car {
    // 非静态成员变量
    private String name; // 车主姓名
    private int speed;   // 当前速率

    // 构造函数
    public Car(String name) {
        this.name = name;
        this.speed = 0; // 初始速率为0
    }

    // 设置车主姓名的方法
    public void setName(String name) {
        this.name = name;
        System.out.println("车主为: " + this.name);
    }

    // 设置车速的方法
    public void setSpeed(int speed) {
        this.speed = speed;
        System.out.println("当前速度为: " + this.speed);
    }

    // 停车的方法
    public void stop() {
        this.speed = 0;
        System.out.println("停车后，车速为: " + this.speed);
    }

    // 主方法用于测试
    public static void main(String[] args) {
        // 创建 Car 类的对象，初始车主姓名为自己的名字
        Car myCar = new Car("自己");

        // 改变车主姓名
        myCar.setName("好友");

        // 改变车速
        myCar.setSpeed(20);

        // 停车
        myCar.stop();
    }
}
