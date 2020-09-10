def left( root,  pdata):
    
    if (root == None): return True

    if (root.data >= pdata): return False

    return (left(root.left, root.data) and left(root.left, pdata) and left(root.right, pdata) and right(root.right, root.data))


def right( root,  pdata): 

    if (root == None): return True
    
    if (root.data <= pdata): return False
    
    return (right(root.right, root.data) and right(root.right, pdata) and right(root.left, pdata) and left(root.left, root.data))


def checkBST( root): 
	return (left(root.left, root.data) and
    	right(root.right, root.data))
