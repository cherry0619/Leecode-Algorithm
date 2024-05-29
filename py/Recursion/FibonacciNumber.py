
class Solution():

    def fib(self,n):
        if n <2:
            return n
        else:
            return self.fib(n-1) +self.fib(n-2)
    



if __name__ =="__main__":
    s =Solution()
    print(s.fib(4))