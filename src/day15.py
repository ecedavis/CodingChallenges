    def insert(self,head,data): 
    #Complete this method
        if (head):
            self.tail(head).next= Node(data)
        else:
            head = Node(data)
        return head
        
    
    def tail(self,head):
        current = head
        while current.next:
            current = current.next	
        return current
