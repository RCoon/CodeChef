t = int(input())
nums = []

for i in range(0, t):
    n = int(input())
    nums.append(n)
    
nums.sort()

for num in nums:
    print(num)