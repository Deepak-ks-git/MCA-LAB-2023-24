def count(w,c):
    i=0
    l=[]
    while i <c:
        l.append(w)
        i+=1
    return l  
w=input('enter the word')
c=int(input('enter the cound'))
s=count(w,c)
i=0
while(i<c):
    print(s[i])
    i+=1
