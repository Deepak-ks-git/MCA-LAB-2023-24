n=int(input('enter the number'))
for i in range(1,n+1):
    for j in range(1,i+1):
        print(i*j,end='\t')
    print()