class Rectangle:
    def __init__self(self,l,b):
        self.__length=l
        self.__breadth=b
    def area(self):
        return self.__length*self.__breadth
    def __lt__(self,other):
        if(self.area()<other.area()):
            return True
        else:
            return False

try:
    l1=int(input('enter length of rectangle'))
    b1=int(input('enter breadth of rectangle'))
    r1=Rectangle(l1,b1)
    l2=int(input('enter length of rectangle'))
    b2=int(input('enter breadth of rectangle'))
    r2=Rectangle(l2,b2)
    print('\n Area of Rectangle 1:',r1.area())
    print('\n Area of Rectangle 2:',r2.area())
    if(r1<r2):
        print('\n Rectangle 1 has less area')
    else:
        print('\n rectangle 2 has less area')


except Exception as e:
    print(e)
class Rectangle:
    def __init__(self,l=1,b=1):
        self.__length=l
        self.__breadth=b
    def area(self):
        return self.__length*self.__breadth
    def __lt__(self,other):
        if(self.area()<other.area()):
            return True
        else:
            return False
try:
    l1=int(input("Enter length of Rectangle 1: "))
    b1=int(input("Enter breadth of Rectangle 1: "))    
    r1=Rectangle(l1,b1)
    l2=int(input("\nEnter length of Rectangle 2: "))
    b2=int(input("Enter breadth of Rectangle 2: "))
    r2=Rectangle(l2,b2)
    print("\nArea of Rectangle 1 : ",r1.area())
    print("Area of Rectangle 2 : ",r2.area())
    if(r1<r2):
        print("\nRectangle 1 has less area")
    else:
        print("\nRectangle 2 has less area")
except Exception as e:
    print(e)