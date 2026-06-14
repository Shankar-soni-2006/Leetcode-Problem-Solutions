import java.util.*;

class Solution {
    public String customSortString(String order, String s) {

        int[] pos = new int[26];
        Arrays.fill(pos, 26);

        for (int i = 0; i < order.length(); i++) {
            pos[order.charAt(i) - 'a'] = i;
        }

        Character[] chars = new Character[s.length()];

        for (int i = 0; i < s.length(); i++) {
            chars[i] = s.charAt(i);
        }

        Arrays.sort(chars, (a, b) ->
            pos[a - 'a'] - pos[b - 'a']
        );

        StringBuilder ans = new StringBuilder();

        for (char c : chars) {
            ans.append(c);
        }

        return ans.toString();
    }
}