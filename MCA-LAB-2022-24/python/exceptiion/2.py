n=int(input('enter number '))
try:
    if n < 90 or n > 120:
        raise ValueError('Abnormal condition')
    else:
        print('n -',n)

except ValueError as ve:
    print(ve)
