# Definition for singly-linked list.
class ListNode(object):
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class Solution(object):

    def addTwoNumbers(self, l1, l2):
        sum1,sum2 = 0,0
        while l1.next is not None:
            sum1 = (sum1 * 10) + l1.val
        while l2.next is not None:
            sum2 = (sum2 * 10) + l2.val
        print(sum1, sum2)

    def addListNode(self, raw_input):
        if not raw_input:
            return None
        nodes_list = [ListNode(val) for val in raw_input]
        for i in range(len(nodes_list) - 1):
            nodes_list[i].next = nodes_list[i + 1]
        return nodes_list[0]


if __name__ == '__main__':
    l1_input = [int(x) for x in input().split()]
    l2_input = [int(x) for x in input().split()]
    solution = Solution()
    l1 = solution.addListNode(l1_input)
    l2 = solution.addListNode(l2_input)
    result = solution.addTwoNumbers(l1, l2)
