class Validate(Exception):pass
try:
    username="user"
    password="123@pass"
    u=input('enter the username')
    p=input('enter the password')
    if u!=username and p!=password:
        raise Validate('invalid login credentials')
    else:
        print('login success !')
    
except Validate as v:
    print(v)