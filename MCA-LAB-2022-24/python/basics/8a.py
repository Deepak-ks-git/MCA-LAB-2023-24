l=[]
n=int(input('enter the size of the list'))
print('enter list')
for i in range(0,n):
    num=int(input())
    l.append(num)
positive=[x for x in l if x>0]
print('the list of positive numbers',positive)
