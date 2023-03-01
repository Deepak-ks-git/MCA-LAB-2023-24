n=int(input('enter the number of terms in the series'))
a,b=0,1
for i in range (n):
    print(a,end='')
    a,b=b,a+b
    
