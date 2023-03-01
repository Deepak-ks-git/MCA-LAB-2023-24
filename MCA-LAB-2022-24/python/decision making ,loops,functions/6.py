def oddeven():
    l=list(map(int,input("Enter the list of numbers : ").split()))
    i=0
    odd=even=0
    while i<len(l):
        if l[i]%2:
            even+=1
        else:
            odd+=1
        i+=1
    return odd,even

odd,even=oddeven()
print(' no of odd numbers',odd)
print('no of even numbers',even)
