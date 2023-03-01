class Student:
    ''' This is a base class for student'''
    count=0
    def getStud(self):
        self.name=input('enter name :')
        self.__course=input('enter course :')
        Student.count+=1
    def display(self):
        if hasattr(self,'percent'):
            print('%d joined for %s has percent %d'%(self.name,self.__course,self.percent))
        else:
            print('%s joined for %s'%(self.name,self.__course))
    def countStud():
        print('students count=',Student.count)

s1=Student()
s1.getStud()
s1.display()
Student.countStud()
setattr(s1,'percent',98)
print(getattr(s1,'percent',40))
print(getattr(s1,'_Student__course','bca'))
print(hasattr(s1,'_Student__course'))
s1.display()
delattr(s1,'percent')
s1.display()