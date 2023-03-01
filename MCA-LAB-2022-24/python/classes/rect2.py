class Rectangle:
    '''Base class for creating rectangle'''
    def __init__(self):
        self.__len=int(input('enter length'))
        self.wid=int(input('enter width'))
    def __str__(self):
        if hasattr(self,'_Rectangle__len') and hasattr(self,'wid'):
            return 'dimension=(%d,%d)'%(getattr(self,'_Rectangle__len'),getattr(self,'wid'))
    def area(self):
        return self.__len*self.wid
    def __del__(self):
        print(self.__class__.__name__,'destroyed')

r1=Rectangle()
print(r1)
print('area =',r1._Rectangle__area())
del r1