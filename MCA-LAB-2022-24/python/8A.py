l=[]
n=int(input("enter the limit"))
print("enter the numbers")
for i in range(0,n):
    num=int(input())
    l.append(num)
print("the list is",l)
positive=[x for x in l if x>0]
print("the positive list is",positive)
