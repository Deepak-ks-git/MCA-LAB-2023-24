class Time:
    def __init__(self,h=0,m=0,s=0):
        self.__hour=h
        self.__minute=m
        self.__second=s
    def __str__(self):
        return("{:02d}".format(self.__hour)+":"+"{:02d}".format(self.__minute)+":"+"{:02d}".format(self.__second))
    def __add__(self,other):
        h=m=s=0
        s+=(self.__second+other.__second)%60
        m+=(self.__second+other.__second)//60
        m+=(self.__minute+other.__minute)%60
        h+=(self.__minute+other.__minute)//60
        h+=(self.__hour+other.__hour)%12
        return (Time(h,m,s))
try:
    print("Enter Time 1\n")
    h1=int(input("Enter Hour : "))
    m1=int(input("Enter Minute : "))
    s1=int(input("Enter Seconds : "))
    t1=Time(h1,m1,s1)
    print("\nEnter Time 2\n")
    h2=int(input("Enter Hour : "))
    m2=int(input("Enter Minute : "))
    s2=int(input("Enter Seconds : "))
    t2=Time(h2,m2,s2)
    t3=t1+t2
    print("\nTime 1 : ",t1)
    print("Time 2 : ",t2)
    print("\nSum : ",t3)
except Exception as e:
    print(e)