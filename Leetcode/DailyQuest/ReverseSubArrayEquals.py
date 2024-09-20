from collections import Counter


def canBeEqual(target, arr):
    print(Counter(target))
    return target == arr


tar = [718, 745, 231, 697]
num = [697, 718, 231, 745]
print(canBeEqual(tar, num))
