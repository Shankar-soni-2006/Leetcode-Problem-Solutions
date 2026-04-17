class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sumA = 0;
        int sumB = 0;
        for(int i: aliceSizes) sumA+=i;
        for(int j: bobSizes) sumB+=j;
        int diff = (sumA-sumB)/2;
        for(int k: aliceSizes){
            for(int l: bobSizes){
               if(k == l+diff) return new int[]{k,l};
            }
        }
        return new int[]{-1,-1};
    }
}