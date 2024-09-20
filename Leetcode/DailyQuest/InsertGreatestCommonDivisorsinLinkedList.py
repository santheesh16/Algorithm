from typing import Optional, List


class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class GreatestCommon:

    def addListNodeValues(self, values: List[int]) -> ListNode:
        head = ListNode(values[0])
        current = head
        for val in values[1:]:
            current.next = ListNode(val)
            current = current.next
        return head

    def display(self, head: ListNode):
        current = head
        values = []
        while current:
            values.append(str(current.val))
            current = current.next
        print(" -> ".join(values))

    def insertGreatestCommonDivisors(self, head: Optional[ListNode]) -> Optional[ListNode]:
        curr_node = head
        while curr_node and curr_node.next:
            curr_val = curr_node.val
            adj_node = curr_node.next
            adj_val= adj_node.val
            div_val = adj_val if curr_val > adj_val else curr_val
            while div_val > 0:
                if curr_val%div_val == 0 and adj_val%div_val == 0:
                    newNode= ListNode(div_val)
                    curr_node.next= newNode
                    newNode.next = adj_node
                    break
                div_val -= 1
            curr_node = curr_node.next.next
        return self.display(head)

    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        prev, curr = None, head

        while curr:
            temp = curr.next
            curr.next= prev
            prev = curr
            curr = temp
        return self.display(prev)

greatest = GreatestCommon()
head = greatest.addListNodeValues([1,2,3,4,5])
print(greatest.reverseList(head))
greatest.display(head)