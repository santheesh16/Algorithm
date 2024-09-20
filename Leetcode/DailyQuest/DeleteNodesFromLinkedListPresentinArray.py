from typing import List, Optional


class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = None


class Solution:

    def modifiedList(self, nums: List[int], head: Optional[ListNode]) -> Optional[ListNode]:
        max_val = -1
        for num in nums:
            max_val = max(num, max_val)

        freq = [False] * (max_val + 1)

        for num in nums:
            freq[num] = True

        temp = ListNode()
        current = temp

        while head:
            if head.val >= len(freq) or not freq[head.val]:
                current.next = head
                current = current.next
            head = head.next
        current.next = None

        return self.display(temp.next)

    def addListNodeValues(self, nums: list[int]) -> ListNode:
        # Create a dummy node to make handling the head easier
        dummy = ListNode()
        current = dummy

        # Iterate over the list of numbers
        for num in nums:
            # Create a new node for each value and link it
            current.next = ListNode(num)
            # Move to the next node
            current = current.next

        # Return the next of dummy (which is the actual head of the list)
        return dummy.next

    def display(self, head: ListNode):
        current = head
        values = []
        while current:
            values.append(str(current.val))
            current = current.next
        print(" -> ".join(values))


sol = Solution()
nums = [1, 2, 3, 4, 5, 6]
skip = [1, 2, 3]
head = sol.addListNodeValues(nums)
print(sol.modifiedList(skip, head))
sol.display(head)

