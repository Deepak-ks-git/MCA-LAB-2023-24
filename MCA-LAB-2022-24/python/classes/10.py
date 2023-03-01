class Publisher:
    def __init__(self):
        self.name=input("Enter publisher name : ")
    def display(self):
        print("Publisher Name : ",self.name)
class Book(Publisher):
    def __init__(self):
        super().__init__()
        self.title=input("Enter title : ")
        self.author=input("Enter author : ")
    def display(self):
        super().display()
        print("Title : ",self.title)
        print("Author : ",self.author)
class Python(Book):
    def __init__(self):
        super().__init__()
        self.price=input("Enter price : ")
        self.nopages=input("Enter no: of pages : ")
    def display(self):
        super().display()
        print("Price : ",self.price)
        print("No: of pages : ",self.nopages)
try:
    b1=Python()
    print("\n__Book Details__")
    b1.display()
except Exception as e:
    print(e)