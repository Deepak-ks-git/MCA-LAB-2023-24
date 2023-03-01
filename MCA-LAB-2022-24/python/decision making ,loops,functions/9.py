def arith(a,b):
    return(a+b,a-b,a*b,a/b)
a=int(input('enter a'))
b=int(input('enter b'))
res=arith(a,b)
print(res[0])
print(res[1])
print(res[2])
print(res[3])

