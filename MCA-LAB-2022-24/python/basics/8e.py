n=input('enter the numbers')
n=list(map(int,n.split()))
e=[d for d in n if d%2]
print(e)
