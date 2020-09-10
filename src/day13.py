#Write MyBook class
class MyBook:
    __metaclass__ = ABCMeta
    def __init__(self,title,author, price):
        self.price=price
        self.title=title
        self.author=author   
    def display(self): 
        print 'Title:', self.title
        print 'Author:', self.author
        print 'Price:', self.price
