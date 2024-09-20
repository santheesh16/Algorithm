from typing import List, Optional


class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = None


class SplitLinkedList:

    def splitListToParts(self, head: Optional[ListNode], k: int) -> List[Optional[ListNode]]:

        while head:
            if head.next or head.val:
                print(head.val)
            head = head.next

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


split = SplitLinkedList()
nums = [1, 2, 3]
head = split.addListNodeValues(nums)
print(split.splitListToParts(head, 5))
split.display(head)

