class Bank:
    def __init__(self):
        self.acno=input("Enter account number : ")
        self.name=input("Enter your name : ")
        self.type=input("Enter account type : ")
        self.bal=int(input("Enter current balance : "))
    def deposit(self):
        am=int(input("\nEnter amount to deposit : "))
        self.bal+=am
    def withdraw(self):
        am=int(input("\nEnter amount to withdraw : "))
        if(am>self.bal):
            return '\nNot enough money in account'
        else:
            self.bal-=am
    def display(self):
        return 'Current Balance : '+str(self.bal)
try:
    b=Bank()
    b.deposit()
    print(b.display())
    print(b.withdraw())
    print(b.display())
except Exception as e:
    print(e)