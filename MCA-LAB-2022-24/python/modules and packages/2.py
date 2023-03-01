import graphics.rectangle as rect
import graphics.circle as circ
from graphics.dgraphics import*
l=int(input("Enter length of rectangle : "))
b=int(input("Enter breadth of rectangle : "))
print("Area of rectangle : ",rect.area(l,b))
print("Perimeter of reactangle : ",rect.pmeter(l,b))
r=int(input("\nEnter radius of circle : "))
print("Area of circle : ",round(circ.area(r),2))
print("Perimeter of circle : ",round(circ.pmeter(r),2))
sr=int(input("\nEnter radius of sphere : "))
print("Area of sphere : ",round(sphere.area(sr),2))
print("Volume of sphere : ",round(sphere.volume(sr),2))
cl=int(input("\nEnter length of cuboid : "))
cb=int(input("Enter breadth of cuboid : "))
ch=int(input("Enter height of cuboid : "))
print("Area of cuboid : ",cuboid.area(cl,cb,ch))
print("Volume of cuboid : ",cuboid.volume(cl,cb,ch))
