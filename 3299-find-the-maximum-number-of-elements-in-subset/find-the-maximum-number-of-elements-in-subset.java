import java.util.*;

class Solution {
    public int maximumLength(int[] arr) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        int maxLength = 1;
        if (freq.containsKey(1)) {
            int count1 = freq.get(1);
            maxLength = Math.max(maxLength, count1 % 2 == 0 ? count1 - 1 : count1);
        }
        for (int key : freq.keySet()) {
            if (key == 1)
                continue;

            int currentLength = 0;
            long currentNum = key;
            while (freq.containsKey((int) currentNum) && freq.get((int) currentNum) >= 2) {
                currentLength += 2;
                currentNum = currentNum * currentNum;
                if (currentNum > 1_000_000_000) {
                    break;
                }
            }
            if (currentNum <= 1_000_000_000 && freq.containsKey((int) currentNum)) {
                currentLength += 1;
            } else currentLength -= 1;
            maxLength = Math.max(maxLength, currentLength);
        }
        return maxLength;
    }
}
