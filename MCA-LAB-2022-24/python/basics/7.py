s=input('enter the string')
l=len(s)
s=s[l-1]+s[1:l-1]+s[0]
print(s)