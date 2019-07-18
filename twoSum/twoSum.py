class Solution(object):
    def twoSum(self, nums, target):
        for m in range(0,len(nums)):
            for n in range (m+1, len(nums)):
                if nums[m]+ nums[n]==target:
                    result=[m,n]
                    return result
        
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """

#changed to use map & loop by list.

class Solution(object):
    def twoSum(self, nums, target):
        dict1 = {}
        for m in range(0,len(nums)): # change to map
            dict1[nums[m]] = m
        for m in range(0,len(nums)): # loop by list. check the wanted number in the map or not.
            n = target - nums[m]
            if dict1.has_key(n) and dict1.get(n)!=m:
                return [m, dict1[n]]
        
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """