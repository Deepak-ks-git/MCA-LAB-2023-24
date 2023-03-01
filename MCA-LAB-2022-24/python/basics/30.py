import math
n1=int(input("Enter first number : "))
n2=int(input("Enter last number : "))
for i in range(n1,n2):
    if int(math.sqrt(i))**2==i:
        t=i
        while t>0:
            if (t%10)%2!=0:
                break
            t=int(t/10)
        else:
            print(i)