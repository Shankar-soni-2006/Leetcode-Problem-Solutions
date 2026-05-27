class Solution {
    public List<Long> maximumEvenSplit(long finalSum) {
        List<Long> res = new ArrayList<>();
        if(finalSum % 2==1) return res;
        long start = 2, end = finalSum;
        while(start <= end){
            res.add(start);
            end-=start;
            start+=2;
        }
        if(end==0) return res;
        else{
            res.set(res.size()-1,res.get(res.size()-1)+end);
        }
        return res;
        // List<Long> ans = new ArrayList<>();
        // long val = finalSum;
        // long sum = 0;
        // ans.add(val%10);
        // while(val!=0){
        //     long x = 0;
        //     long y = 0;
        //     long num = val-(val%10);
        //     x = (int)num/2;
        //     y = (int)num/2;
        //     if(x==y){
        //         x--;
        //         y++;
        //         if((x+y) == num) sum+=(x+y);
        //         ans.add(x);
        //         ans.add(y);
        //     }
        // }
        // return ans;
    }
}