class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        a = Counter(nums)
        for key,count in a.items():
            if count == 1:
               return key
            