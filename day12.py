class Student(Person):

    #   Class Constructor
    #   
    #   Parameters:
    #   firstName - A string denoting the Person's first name.
    #   lastName - A string denoting the Person's last name.
    #   id - An integer denoting the Person's ID number.
    #   scores - An array of integers denoting the Person's test scores.
    #
    # Write your constructor here
    scores = []
    def __init__(self, firstName, lastName, idNumber, scores):
        self.firstName = firstName
        self.lastName = lastName
        self.idNumber = idNumber
        self.scores = scores
        
        
    def printPerson(self):
        print"Name:", self.lastName + ",", self.firstName
        print "ID:", self.idNumber
    
    def calculate(self):
        if len(scores)>1:
            average = float(sum(self.scores)) / len(self.scores)
        else:
            average = scores[0]
        if average>=90:    return 'O'
        elif average>=80:    return 'E'
        elif average>=70:    return 'A'
        elif average>=55:    return 'P'
        elif average>=40:    return 'D'
        elif average>=0:    return 'T'
