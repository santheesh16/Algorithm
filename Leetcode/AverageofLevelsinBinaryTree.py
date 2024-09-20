from collections import deque
from typing import List


class Node:
    def __init__(self, val, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


def level_order_traversal(root: Node) -> List[float]:
    if not root:
        return []

    result = []
    queue = deque([root])
    count = 0
    result.append(root.val)
    while queue:
        level_size = len(queue)
        for _ in range(level_size):
            node = queue.popleft()
            if node.left:
                queue.append(node.left)
                count += 1
            if node.right:
                queue.append(node.right)
                count += 1
            if len(queue) > 1:
                result.append((queue[0].val + queue[1].val) / 2)
    return result


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
    res = level_order_traversal(root)
    print(res)
