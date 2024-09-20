max_depth = 0


class Node:
    def __init__(self, val, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


# Using global variable
def tree_max_depth(root: Node, current_depth=0) -> int:
    global max_depth
    if root is None:
        max_depth = max(current_depth, max_depth)
        return 0
    else:
        current_depth += 1

    tree_max_depth(root.left, current_depth)
    tree_max_depth(root.right, current_depth)
    return max_depth - 1

def tree_max_depth1(root: Node) -> int:
    def dfs(root):
        if root is None:
            return 0

        return max(dfs(root.left),dfs(root.right)) + 1
    return dfs(root) - 1 if root else 0


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
    res = tree_max_depth(root)
    print(res)
