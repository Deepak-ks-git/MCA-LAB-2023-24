s=input('enter the string')
if(len(s)>2):
    print(s[:2]+s[-2:])
elif len(s)==2:
    print(s+s)
else:
    print(s)
