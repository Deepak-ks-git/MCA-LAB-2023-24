class Flower:
    def __init__(self):
        self.name=input("Enter flower name : ")
    def __str__(self):
        if(hasattr(self,'petalColor')):
            return self.petalColor+' '+self.name
        else:
            return 'Unknown Flower'
try:
    a=Flower()
    print(a,end='\n\n')
    setattr(a,'petalColor','Red')
    print(a)
except Exception as e:
    print(e)
    