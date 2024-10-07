package chapter1;

public class BankAccount {
    // 私有属性
    private int accountNumber;  // 帐号
    private double balance;      // 存款余额

    // 构造函数
    public BankAccount(int accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // 查询余额的方法
    public double getLeftMoney() {
        return balance;
    }

    // 存款的方法
    public void saveMoney(double money) {
        if (money > 0) {
            balance += money;
            System.out.println("存入 " + money + " 元成功。");
        } else {
            System.out.println("存款金额必须大于0。");
        }
    }

    // 取款的方法
    public void getMoney(double money) {
        if (money <= balance) {
            balance -= money;
            System.out.println("取出 " + money + " 元成功。");
        } else {
            System.out.println("只能取出：" + balance + " 元，余额不足。");
        }
    }

    // 显示帐号信息的方法
    public void displayAccountInfo() {
        System.out.println("帐号: " + accountNumber + ", 当前余额: " + balance + " 元");
    }

    // 主方法用于测试
    public static void main(String[] args) {
        // 创建 BankAccount 类的对象
        BankAccount ba = new BankAccount(888123, 1000);

        // 显示初始帐号信息
        ba.displayAccountInfo();

        // 存款操作
        ba.saveMoney(21000);
        System.out.println("存入21000元后余额为：" + ba.getLeftMoney() + " 元");

        // 取款操作
        ba.getMoney(11500);
        System.out.println("取出11500元后余额为：" + ba.getLeftMoney() + " 元");

        // 再次显示帐号信息
        ba.displayAccountInfo();
    }
}
