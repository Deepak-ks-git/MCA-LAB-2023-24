l=list(input('enter list ').split())
i=c=0
while i<len(l):
    if len(l)>=2 and (l[i][0].lower()==l[i][-1].lower()):
        c+=1
    i+=1
print('no og strings=',c)