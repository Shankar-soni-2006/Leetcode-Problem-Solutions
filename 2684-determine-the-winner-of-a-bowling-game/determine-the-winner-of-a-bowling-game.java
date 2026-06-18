class Solution {
    public int point(int[] arr){
        int total = 0;
        int n = arr.length;
        for(int i = 0; i < n; i++){
            if((i>=1 && arr[i-1]==10) || (i >= 2 && arr[i-2]==10)){
                total+=(2*arr[i]);
            }else total+=arr[i];
        }
        return total;
    }
    public int isWinner(int[] player1, int[] player2) {
        int p1 = point(player1);
        int p2 = point(player2);
        System.out.print(p1+" "+p2);
        if(p1 > p2) return 1;
        if(p1 < p2) return 2;
        else return 0;
    }
}