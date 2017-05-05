root=Node(1)
binary_insert(root, Node(3))
binary_insert(root, Node(2))

class Node:
    def __init__(self, val):
        self.left = None
        self.right = None
        self.data = val

def binary_insert(root, node):
    if root is None:
        root = node
    else:
        if root.data > node.data:
            if root.left is None:
                root.left = node
            else:
                binary_insert(root.left, node)
        else:
            if root.r_child is None:
                root.r_child = node
            else:
                binary_insert(root.right, node)

def pre_order_print(root):
    if not root:
        return        
    print root.data
    pre_order_print(root.left)
    pre_order_print(root.right)   
