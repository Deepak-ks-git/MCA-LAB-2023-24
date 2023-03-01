l1=list(map(int,input("enter the list1").split()))
l2=list(map(int,input("enter the list2").split()))
if(len(l1)==len(l2)):
    print("same length")
else:
    print("different length")
if(sum(l1)==sum(l2)):
    print("same sum")
else:
    print("different sum")
if(set(l1)&set(l2)):
    print("same values occur in list 1 and list 2")
else:
    print("non common values")
