from Leetcode.TreeNode import Node


def isSameTree(p, q):
    if p.val == q.val:
        return True
    return isSameTree(p.left, q.left) and isSameTree(p.right, q.right)


if __name__ == '__main__':
    p,q = None,None
    nums = [int(x) for x in input().split()]
    for n in range(len(nums)):
        if n == 0:
            p = Node(n)
        else:
            p.insert(n)
    nums = [int(x) for x in input().split()]
    for n in range(len(nums)):
        if n == 0:
            q = Node(n)
        else:
            q.insert(n)
    res = isSameTree(p, q)
    print(res)