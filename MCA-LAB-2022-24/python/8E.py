n=input("enter a list of numbers")
n=list(map(int,n.split()))
x=[x for x in n if (x%2)]
print("the list after removing even numbers",x);
