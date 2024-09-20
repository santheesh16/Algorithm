from typing import List

class Node:
    def __init__(self, val, children=None):
        if children is None:
            children = []
        self.val = val
        self.children = children


def ternary_tree_paths(root):
    def dfs(root, path, res):
        # exit condition: when a leaf node is reached, append the path to the results
        if all(c is None for c in root.children):
            res.append('->'.join(path) + '->' + str(root.val))
            return

        # DFS on each non-null child
        for child in root.children:
            if child is not None:
                dfs(child, path + [str(root.val)], res)

    res = []
    if root: dfs(root, [], res)
    return res


# this function builds a tree from input; you don't have to modify it
# learn more about how trees are encoded in https://algo.monster/problems/serializing_tree
def build_tree(nodes, f):
    val = next(nodes)
    num = int(next(nodes))
    children = [build_tree(nodes, f) for _ in range(num)]
    return Node(f(val), children)

if __name__ == '__main__':
    root = build_tree(iter(input().split()), int)
    res = ternary_tree_paths(root)
    for line in res:
        print(line)
