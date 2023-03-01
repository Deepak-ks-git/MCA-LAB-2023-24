n=input('enter the list of first name')
c=[x for x in n.split() if x.lower().startswith('a')]
print(len(c))