class Rectangle:
    def __init__(self):
        self.length=int(input("Enter length : "))
        self.breadth=int(input("Enter breadth : "))
class Cuboid(Rectangle):
    def __init__(self):
        super().__init__()
        self.height=int(input("Enter height : "))
    def volume(self):
        return(self.length*self.breadth*self.height)
    def __le__(self,other):
        if(self.volume()<=other.volume()):
            return True
        else:
            return False        
try:
    print("Cuboid 1 : ")
    c1=Cuboid()
    print("\nCuboid 2 : ")
    c2=Cuboid()
    print("\nVolume of Cuboid 1 : ",c1.volume())
    print("Volume of Cuboid 2 : ",c2.volume())
    if(c1<=c2):
        print("\nVolume of Cuboid 1 is less than or equal to volume of Cuboid 2")
    else:
        print("\nVolume of Cuboid 2 is greater than volume of Cuboid 1")
except Exception as e:
    print(e)