class Book:
    def __init__(self):
        self.title=input("Enter title name : ")
        self.author=input("Enter author name : ")
    def __str__(self):
        if(hasattr(self,'publisher')):
            return self.title+' written by '+self.author+' is published by '+self.publisher
        else:
            return 'Unknown Publisher'
try:
    b=Book()
    print(b,end='\n\n')
    setattr(b,'publisher','Sun India')
    print(b)
except Exception as e:
    print(e)