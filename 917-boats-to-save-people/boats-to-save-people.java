class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int boatCount = 0;
        Arrays.sort(people);
        int i = 0, j = people.length-1;
        while(i<=j){
            // boatCount++;
            if((people[i]+people[j]) <= limit) {
                i++;
            }
            j--;
             boatCount++;
        }
        return boatCount;
    }
}