from typing import List, Optional

class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

class SpiralMatrixIV:
    def __init__(self, m: int, n: int):
        self.matrix = [[-1 for _ in range(n)] for _ in range(m)]

    def addListNodeValues(self, values: List[int]) -> ListNode:
        head = ListNode(values[0])
        current = head
        for val in values[1:]:
            current.next = ListNode(val)
            current = current.next
        return head

    def spiralMatrix(self, m: int, n: int, head: Optional[ListNode]) -> List[List[int]]:
        # Directions for moving right, down, left, up in the spiral
        directions = [(0, 1), (1, 0), (0, -1), (-1, 0)]
        dir_idx = 0
        i, j = 0, 0
        for _ in range(m * n):
            if head:
                self.matrix[i][j] = head.val
                head = head.next
            else:
                self.matrix[i][j] = -1

            next_i, next_j = i + directions[dir_idx][0], j + directions[dir_idx][1]
            if not (0 <= next_i < m and 0 <= next_j < n and self.matrix[next_i][next_j] == -1):
                dir_idx = (dir_idx + 1) % 4
                next_i, next_j = i + directions[dir_idx][0], j + directions[dir_idx][1]
            i, j = next_i, next_j

        return self.matrix

# Example usage:
spiral = SpiralMatrixIV(3, 5)
head = spiral.addListNodeValues([3, 0, 2, 6, 8, 1, 7, 9, 4, 2, 5, 5, 0])
m, n = 3, 5
result = spiral.spiralMatrix(m, n, head)
print(result)