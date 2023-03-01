a=int(input('enter a number less than 10'))
if a<10:
    n1=int('%s'%a)
    n2=int('%s%s'%(a,a))
    n3=int('%s%s%s'%(a,a,a))
    print(n1+n2+n3)