def sum(num):
    if(num)==0:
        return 0
    else:
       return num+sum(num-1)
n=int(input('enter a number'))
print(sum(n))
    
    