n=int(input("enter final year"))
l=[y for y in range(2023,n+1) if y%4==0]
print("the leap years are:",l)
