class Solution {
    public int commonPrefix(String s1, String s2){
        int len = Math.min(s1.length(),s2.length());
        int i = 0;
        while(i < len && s1.charAt(i)==s2.charAt(i)) i++;
        
        return i;
    }
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        
        String[] a1 = new String[arr1.length];
        String[] a2 = new String[arr2.length];
        for(int i = 0; i < arr1.length; i++) a1[i] = String.valueOf(arr1[i]);
        for(int j = 0; j < arr2.length; j++) a2[j] = String.valueOf(arr2[j]);
        Arrays.sort(a1);
        Arrays.sort(a2);
        int i = 0,j = 0, maxL = 0;
        while(i < a1.length && j < a2.length){
            int leng = commonPrefix(a1[i],a2[j]);
            maxL = Math.max(maxL,leng);
            if(a1[i].compareTo(a2[j]) < 0) i++;
            else j++;
        }
        return maxL;
        // int maxL = 0;
        // for(int n1 : arr1){
        //     String s1 = String.valueOf(n1);
        //     for(int n2 : arr2){
        //         String s2 = String.valueOf(n2);
        //         int count = 0;
        //         int minL = Math.min(s1.length(),s2.length());
        //         while(count < minL && s1.charAt(count)==s2.charAt(count))  count++;
        //         if(count > maxL) maxL = count;
        //     }
        // }
        // return maxL;
    }
}