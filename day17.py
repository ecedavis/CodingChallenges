#Write your code here
class Calculator:
    def __init__(self):
        pass
        
    def power(self, base,exp):
        if base<0 or exp<0:
            return Exception('n and p should be non-negative')
            
        else:
            return base**exp
