class Time:
    def __init__(self,h=0,m=0,s=0):
        self.hour=h
        self.minute=m
        self.second=s
    def __str__(self):
        return("{:02d}".format(self.hour)+":"+"{:02d}".format(self.minute)+":"+"{:02d}".format(self.second))
    def __lt__(self,other):
        if(self.hour!=other.hour and self.hour<other.hour):
            return True
        else:
            return False
        if(self.minute!=other.minute and self.minute<other.minute):
            return True
        else:
            return False
        if(self.second!=other.second and self.second<other.second):
            return True
        else:
            return False
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
    print("\nTime 1 : ",t1)
    print("Time 2 : ",t2)
    if(t1<t2):
        print("\nTime 1 is earlier")
    else:
        print("\nTime 2 is earlier")
except Exception as e:
    print(e)