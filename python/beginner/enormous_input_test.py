n, k = input().split(" ")
n = int(n)
k = int(k)
 
count = 0
 
for i in range(0, n):
    t = int(input())
    if (t % k == 0):
        count += 1
 
print(count)