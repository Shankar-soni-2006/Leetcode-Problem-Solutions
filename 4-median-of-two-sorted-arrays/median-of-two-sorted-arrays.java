class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> merge = new ArrayList<>();
        for(int i:nums1) merge.add(i);
        for(int i:nums2) merge.add(i);
        Collections.sort(merge);
        double ans = 0;
        if(merge.size()%2!=0){
           ans = merge.get(merge.size()/2);
        }else{
           ans = (merge.get(merge.size()/2 - 1) + merge.get(merge.size()/2)) / 2.0;
        }
        return ans;
    }
}