class Node:
    def __init__(self, val, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


def insert_bst(bst: Node, val: int) -> Node:
    def dfs(root, val):
        if root is None:
            return Node(val)
        if val < root.val:
            if root.left is None:
                root.left = Node(val)
            else:
                dfs(root.left, val)
        elif val > root.val:
            if root.right is None:
                root.right = Node(val)
            else:
                dfs(root.right, val)
        else:
            return
        return root
    return dfs(bst, val)


# this function builds a tree from input; you don't have to modify it
# learn more about how trees are encoded in https://algo.monster/problems/serializing_tree
def build_tree(nodes, f):
    val = next(nodes)
    if val == 'x': return None
    left = build_tree(nodes, f)
    right = build_tree(nodes, f)
    return Node(f(val), left, right)


def format_tree(node):
    if node is None:
        yield 'x'
        return
    yield str(node.val)
    yield from format_tree(node.left)
    yield from format_tree(node.right)


if __name__ == '__main__':
    bst = build_tree(iter(input().split()), int)
    val = int(input())
    res = insert_bst(bst, val)
    print(' '.join(format_tree(res)))
