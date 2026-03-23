class Solution:
    def singleNumber(self, nums: List[int]) -> List[int]:
        ans = []
        a = Counter(nums)
        for key,count in a.items():
            if count==1:
                ans.append(key)
        return ans

        