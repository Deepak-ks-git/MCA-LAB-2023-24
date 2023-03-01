sqr=lambda a:a*a
rect=lambda l,b:l*b
tr=lambda b,h:0.5*b*h
a=int(input("Enter the side of square : "))
b=int(input("Enter length of rectangle : "))
c=int(input("Enter breadth of rectangle : "))
d=int(input("Enter base of traingle : "))
e=int(input("Enter height of traingle : "))
print("Area of square : ",sqr(a))
print("Area of rectngle : ",rect(b,c))
print("Area of triangle : ",tr(d,e))