from collections import deque
class Solution:
    # Write your code here
    def __init__(self):
        self.q=deque()
        self.s=[]
        
    def pushCharacter(self, ch):
        #stack
        self.s.append(ch)
        
    def enqueueCharacter(self, ch):
        #queue
        self.q.append(ch)
        
    def popCharacter(self):
        #stack
        return self.s.pop()
        
    def dequeueCharacter(self):
        #queue
        return self.q.popleft()
        
