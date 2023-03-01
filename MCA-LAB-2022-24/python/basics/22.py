s=list(input("Enter the sentance : ").split())
d={}
for w in s:
    d[len(w)]=d.get(len(w),0)+1
print("Length of longest word : ",max(d.keys()))
if(d[max(d.keys())]>1):
    print('BINGO')