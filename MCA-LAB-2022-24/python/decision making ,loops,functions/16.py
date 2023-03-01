def reverse(str):
    if(len(str)==1):
        return str[-1]
    else:
        return str[-1]+reverse(str[:-1])
str=input('enter the string')
print(reverse(str))