package test;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 2, 1};  // 示例数组
        int x = 2;                  // 目标值

        SubarrayXorCounter counter = new SubarrayXorCounter();
        int result = counter.countinterval(a, x);
        System.out.println("满足条件的子区间数量: " + result);
    }
    public int countinterval(int[] a, int x) {
        if (a.length <= 1) 
            return 0;

        int count = 0;
        int prefixXor = 0;

        // 使用 HashMap 记录前缀异或和的出现次数，分为奇数和偶数位置
        Map<Integer, int[]> xorMap = new HashMap<>();
        xorMap.put(0, new int[]{1, 0}); // 初始化，偶数位置异或和为 0 的计数为 1

        for (int i = 0; i < a.length; i++) {
            prefixXor ^= a[i]; // 更新当前的前缀异或和

            // 计算目标异或和
            int targetXor = prefixXor ^ x;

            // 检查是否存在满足条件的前缀异或和，并根据位置的奇偶性选择计数
            if (xorMap.containsKey(targetXor)) {
                int[] counts = xorMap.get(targetXor);
                if (i % 2 == 0) { // 当前索引为偶数，与之前奇数位置的前缀异或形成偶数长度的区间
                    count += counts[1]; // 累加奇数位置的计数
                } else { // 当前索引为奇数，与之前偶数位置的前缀异或形成偶数长度的区间
                    count += counts[0]; // 累加偶数位置的计数
                }
            }

            // 更新当前前缀异或和在奇偶位置的计数
            xorMap.putIfAbsent(prefixXor, new int[]{0, 0});
            if (i % 2 == 0) {
                xorMap.get(prefixXor)[0]++; // 偶数位置计数加一
            } else {
                xorMap.get(prefixXor)[1]++; // 奇数位置计数加一
            }
        }

        return count;
    }
}
