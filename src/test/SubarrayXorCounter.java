package test;

import java.util.HashMap;

public class SubarrayXorCounter {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 2, 1};  // 示例数组
        int x = 2;                  // 目标值

        SubarrayXorCounter counter = new SubarrayXorCounter();
        int result = counter.countinterval(a, x);
        System.out.println("满足条件的子区间数量: " + result);
    }

    public int countinterval(int[] a, int x) {
        int n = a.length;
        int count = 0;
        int prefixXor = 0;

        // 使用 HashMap 存储每种前缀异或和的奇数和偶数位置的出现次数
        HashMap<Integer, Integer[]> xorMap = new HashMap<>();
        xorMap.put(0, new Integer[]{1, 0}); // 初始状态下，偶数前缀异或和为 0 的次数为 1

        for (int i = 0; i < n; i++) {
            prefixXor ^= a[i]; // 更新当前的前缀异或和

            // 计算目标异或和以满足条件
            int targetXor = prefixXor ^ x;

            // 检查是否存在符合条件的前缀异或和，并区分奇偶性
            if (xorMap.containsKey(targetXor)) {
                Integer[] counts = xorMap.get(targetXor);
                if (i % 2 == 0) { // 当前索引为偶数，则与之前的奇数位置的前缀异或形成偶数长度的区间
                    count += counts[1]; // 累加奇数位置的计数
                } else { // 当前索引为奇数，则与之前的偶数位置的前缀异或形成偶数长度的区间
                    count += counts[0]; // 累加偶数位置的计数
                }
            }

            // 更新当前前缀异或和的奇偶性计数
            xorMap.putIfAbsent(prefixXor, new Integer[]{0, 0});
            Integer[] currentCounts = xorMap.get(prefixXor);
            if (i % 2 == 0) {
                currentCounts[0]++; // 偶数位置
            } else {
                currentCounts[1]++; // 奇数位置
            }
        }

        return count;
    }
}
