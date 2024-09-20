from math import inf


class Node:
    def __init__(self, val, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


def valid_bst(root: Node) -> bool:
    def dfs(root, min_val, max_val):
        # empty nodes are always valid
        if not root:
            return True
        if not (min_val < root.val < max_val):
            return False
        return dfs(root.left, min_val, root.val) and dfs(root.right, root.val, max_val)
    return dfs(root, -inf, inf) # root is always valid


# this function builds a tree from input; you don't have to modify it
def build_tree(nodes, f):
    val = next(nodes)
    if val == 'x': return None
    left = build_tree(nodes, f)
    right = build_tree(nodes, f)
    return Node(f(val), left, right)


if __name__ == '__main__':
    root = build_tree(iter(input().split()), int)
    res = valid_bst(root)
    print('true' if res else 'false')
