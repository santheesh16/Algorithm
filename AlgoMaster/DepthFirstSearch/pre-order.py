class Node:
    def __init__(self, val, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


# Pre-order always prints current -> left -> right
def pre_order_traversal(root: Node) -> None:
    if root is not None:
        print(root.val)
        pre_order_traversal(root.left)
        pre_order_traversal(root.right)


# this function builds a tree from input; you don't have to modify it
# learn more about how trees are encoded in https://algo.monster/problems/serializing_tree
def build_tree(nodes, f):
    val = next(nodes)
    if val == 'x': return None
    left = build_tree(nodes, f)
    right = build_tree(nodes, f)
    return Node(f(val), left, right)


if __name__ == '__main__':
    root = build_tree(iter(input().split()), int)
    pre_order_traversal(root)
