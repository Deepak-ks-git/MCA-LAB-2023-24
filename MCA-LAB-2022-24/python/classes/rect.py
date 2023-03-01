class Rectangle:
    def __init__(self):
        self.__length=int(input('enter the length'))
        self.wid=int(input('enter the width'))
    def area(self):
        if(hasattr(self,'_Rectangle__length')):
            return self.__length*self.wid
        else:
            return 'area could not be found'
    def perimeter(self):
        print('perimeter of %d and %d is %d'%(getattr(self,'_Rectangle__length'),getattr(self,'wid'),2*(self.__length*self.wid)))
r1=Rectangle()
print(r1.area())
r1.perimeter()
delattr(r1,'_Rectangle__length')
print(r1.area())