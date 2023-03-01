class Person:
    def getname(self,name='jack'):
        self.__name=name
    def dispname(self):
        print('name',self.__name)


class Staff(Person):
    def getdetails(self,name,sal):
        self.getname(name)
        self.__sal=sal

    def dispdetails(self):
        self.dispname()
        print('salary ',self.__sal)

s=Staff()
s.getdetails('abc',4000)
s.dispname()
s.dispdetails()
