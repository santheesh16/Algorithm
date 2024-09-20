from collections import deque
from typing import List


class Node:
    def __init__(self, val, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


def zig_zag_traversal(root: Node) -> List[List[int]]:
    res = []
    queue = deque([root])
    left_to_right = True
    while len(queue) > 0:
        level_values = []
        for _ in range(len(queue)):
            node = queue.popleft()
            level_values.append(node.val)
            if node.left:
                queue.append(node.left)
            if node.right:
                queue.append(node.right)
        if left_to_right:
            res.append(level_values)
        else:
            res.append(level_values[::-1])
    return res


def build_tree(nodes, f):
    val = next(nodes)
    if val == 'x': return None
    left = build_tree(nodes, f)
    right = build_tree(nodes, f)
    return Node(f(val), left, right)


if __name__ == '__main__':
    root = build_tree(iter(input().split()), int)
    res = zig_zag_traversal(root)
    for row in res:
        print(' '.join(map(str, row)))
