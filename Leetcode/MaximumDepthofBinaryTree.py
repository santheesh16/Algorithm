global left_height
global right_height


class Node:
    def __init__(self, val, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


def maxDepth(root):
    if root is "null":
        return 0
    left_height = maxDepth(root.left)
    right_height = maxDepth(root.right)
    if left_height == "null" or right_height == "null":
        return -1
    if abs(left_height - right_height) > 1:
        return -1
    return max(left_height, right_height) + 1


def build_tree(nodes, f):
    val = next(nodes)
    if val == "null": return None
    left = build_tree(nodes, f)
    right = build_tree(nodes, f)
    return Node(f(val), left, right)


if __name__ == '__main__':
    bst = build_tree(iter(input().split()), int)
    print(maxDepth(bst))
