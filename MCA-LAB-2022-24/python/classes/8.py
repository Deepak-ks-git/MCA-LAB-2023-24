class Person:
    def __init__(self):
        self.rollno=input("Enter your roll number : ")
        self.name=input("Enter your name : ")
    def display(self):
        print("Roll Number : ",self.rollno)
        print("Name : ",self.name)
class Marks:
    def __init__(self):
        self.maths=int(input("Enter marks for maths : "))
        self.computer=int(input("Enter marks for computer : "))
    def display(self):
        print("Marks for Maths : ",self.maths)
        print("Marks for Computer : ",self.computer)
class Student(Person,Marks):
    def __init__(self):
        super().__init__()
        Marks.__init__(self)
        self.percentage=(self.maths+self.computer)/2
    def display(self):
        super().display()
        Marks.display(self)
        print("Percentage : ",self.percentage)
        if(self.percentage<50):
            print("Failed")
        else:
            print("Passed")
try:
    s1=Student()
    print("\n____Student Details____")
    s1.display()
except Exception as e:
    print(e)