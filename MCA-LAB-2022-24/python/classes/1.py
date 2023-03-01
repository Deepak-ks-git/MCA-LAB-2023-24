class Rectangle:
    def __init__(self,l=1,b=1):
        self.__length=l
        self.__breadth=b
    def area(self):
        return self.__length*self.__breadth
    def perimeter(self):
        return 2*(self.__length+self.__breadth)
try:
    l=int(input("Enter length : "))
    b=int(input("Enter breadth : "))    
    r=Rectangle(l,b)
    print("\nArea of Rectangle : ",r.area())
    print("Perimeter of Rectangle : ",r.perimeter())
except Exception as e:
    print(e)
    