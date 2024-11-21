package test;

public class GoodNumbers {

    public static void main(String[] args) {
        System.out.println(new GoodNumbers().serial_number(20));
    }

    public int serial_number(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (isGoodNumber(i)) {
                count++;
            }
        }
        return count;
    }

    private boolean isGoodNumber(int numIn) {
        int num = numIn;
        while (num > 10) {
            int current = num % 10;
            int next = (num / 10) % 10;
            if (current - next != 1) {
                return false;
            }
            num /= 10;
        }

        return true;
    }
}