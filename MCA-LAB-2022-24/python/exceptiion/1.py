try:
    a=int(input('enter the numerator '))
    b=int(input('enter the denominator '))
    c=a/b

except ZeroDivisionError as ze:
    print('divison by zero error-',ze)
except ValueError as ve:
    print('invalid input-',ve)
else:
    print('%d / %d = %f'%(a,b,a/b))
finally:
    print('end')

