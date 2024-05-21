class Solution():

    def getSum(a,b):
        if b>0:
            for i in range(b):
                a+=1
        if b<0:
            for i in range(b,0,1):
                a-=1
        return a