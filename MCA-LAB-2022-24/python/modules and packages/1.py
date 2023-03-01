import operations
a=int(input('enter a :'))
b=int(input('enter b :'))
print(f'{a} + {b} = {operations.add(a,b)}')
print(f'{a} - {b} = {operations.sub(a,b)}')
print(f'{a} * {b} = {operations.mul(a,b)}')
print(f'{a} / {b} = {operations.div(a,b)}')
