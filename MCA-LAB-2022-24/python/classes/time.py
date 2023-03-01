class Time:
    '''timen for time objects'''
    def __init__(self,hour=0,min=0,sec=0):
        self.__hour=hour
        self.min=min
        self.sec=sec
        print('time initiated')

    def setTime(self,hour=0,min=0,sec=0):
        self.__hour=hour
        self.min=min
        self.sec=sec
        print('time reset')

    def getTime(self):
        return self.__hour,self.min,self.sec
    def show(self):
        print(self.__hour,self.min,self.sec)

t1=Time()
t1.show()
t2=Time(11,45)
t2.show()
t1.setTime(12,45,40)
t1.show()
print('time',t2.getTime())



        