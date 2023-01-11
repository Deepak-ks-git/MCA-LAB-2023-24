n=input("enter a list of names")
c=[x for x in n.split() if x.lower().startswith('a')]
print(len(c))
