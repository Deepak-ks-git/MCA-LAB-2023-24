
l=list(map(int,input("Enter the numbers : ").split()))
n=int(input("Enter the item : "))
i=c=0
while i<len(l):
    if l[i]==n:
        c+=1
    i+=1
if c==0:
    print("Item not found")
else:
    print("Item found ",c," times")