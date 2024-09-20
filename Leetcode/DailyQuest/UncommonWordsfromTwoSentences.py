from collections import Counter
from typing import List


def uncommonFromSentences(s1: str, s2: str) -> List[str]:
    list_s1 = s1.split(" ")
    list_s2 = s2.split(" ")
    set_s1 = Counter(list_s1)
    set_s2 = Counter(list_s2)
    left_s1,right_s2=0,0
    res =[]
    while left_s1 < len(list_s1) or right_s2 < len(list_s2):
        if left_s1 < len(list_s1) and list_s1[left_s1] not in list_s2 and set_s1.get(list_s1[left_s1]) == 1:
            res.append(list_s1[left_s1])
        if right_s2 < len(list_s2) and list_s2[right_s2] not in list_s1 and set_s2.get(list_s2[right_s2]) == 1:
            res.append(list_s2[right_s2])
        left_s1 += 1
        right_s2 += 1
    return res

    # Step 1: inalize Slow and Fast variable slow for s1 and fast s2 and convert strings to list
    # Step 2: Iterate both list string parallely to check same sentences
    # Step 3: If the length of the one string reached end we need to check other string till the end to check other
    # sentences are same

s1 = "this apple is sweet"
s2 = "this apple is sour"
print(uncommonFromSentences(s1,s2))
s1 = "apple apple"
s2 = "banana"
print(uncommonFromSentences(s1,s2))
s1 = "abcd def abcd xyz"
s2 = "ijk def ijk"
print(uncommonFromSentences(s1,s2))

