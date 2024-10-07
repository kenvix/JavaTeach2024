package chapter1;

// 定义接口
interface CalculateStrategy {
    double calculate(double a, double b);
}

// 实现加法策略
class AddStrategy implements CalculateStrategy {
    @Override
    public double calculate(double a, double b) {
        return a + b;
    }
}

// 实现减法策略
class MinusStrategy implements CalculateStrategy {
    @Override
    public double calculate(double a, double b) {
        return a - b;
    }
}

// 实现乘法策略
class MultiplyStrategy implements CalculateStrategy {
    @Override
    public double calculate(double a, double b) {
        return a * b;
    }
}

// 实现除法策略
class DivideStrategy implements CalculateStrategy {
    @Override
    public double calculate(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed.");
        }
        return a / b;
    }
}

// 测试类
public class Main {
    public static void main(String[] args) {
        CalculateStrategy add = new AddStrategy();
        CalculateStrategy minus = new MinusStrategy();
        CalculateStrategy multiply = new MultiplyStrategy();
        CalculateStrategy divide = new DivideStrategy();

        double a = 10.0;
        double b = 5.0;

        System.out.println("Addition: " + add.calculate(a, b));       // 输出 15.0
        System.out.println("Subtraction: " + minus.calculate(a, b));  // 输出 5.0
        System.out.println("Multiplication: " + multiply.calculate(a, b)); // 输出 50.0
        System.out.println("Division: " + divide.calculate(a, b));    // 输出 2.0

        // 测试除以零的情况
        try {
            System.out.println("Division by zero: " + divide.calculate(a, 0));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage()); // 输出 "Division by zero is not allowed."
        }
    }
}
