def ischeck(s):
    if s.startswith('/s'):
        return s
    else:
        return '/s'+s
s=input('enter a string')
print(ischeck(s))