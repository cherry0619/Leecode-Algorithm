class Solution:
    # brute force
    def twoSumBruteForce(self,nums,target):
        l = len(nums)
        for i in range(l):
            complement = target- nums[i]
            for j in range(i+1,l):
                if nums[j]== complement:
                    return [i,j]
    
    # hashmap
    def twoSumHashMap(self,nums,target):
        hash_map ={}
        for idx,num in enumerate(nums):
            complement = target-num
            if complement in hash_map.keys():
                return [hash_map[complement],idx]
            hash_map[num] =idx



if __name__ =="__main__":
    nums =[3,3]
    target =6
    s =Solution()
    print(s.twoSumBruteForce(nums,target))
    print(s.twoSumHashMap(nums,target))