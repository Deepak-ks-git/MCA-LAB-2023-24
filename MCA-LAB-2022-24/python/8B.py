n=input("enter a list of numbers")
n=list(map(int,n.split()))
s=[x*x for x in n]
print("the square of numbers are ",s)
