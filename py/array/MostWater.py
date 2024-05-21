class Solution:
    def maxAreaTwoPointer(self, height):
        max_area =0
        left_idx = 0
        right_idx = len(height)-1
        while left_idx < right_idx:
            cur_area =min(height[left_idx],height[right_idx])*(right_idx-left_idx)
            max_area = max(cur_area,max_area)

            if height[left_idx] < height[right_idx]:
                left_idx +=1
            else:
                right_idx -=1
        return max_area



if __name__ =="__main__":
    s =Solution()
    height =[1,8,6,2,5,4,8,3,7]
    print(s.maxAreaTwoPointer(height))