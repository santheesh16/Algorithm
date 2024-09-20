
def strStr(haystack, needle):

    findLen = len(needle)
    for i in range(len(haystack)):
        if needle == haystack[i:findLen]:
            return i
        findLen += 1
    return -1

def strDS(haystack, needle):
    for i in range(len(haystack)-len(needle)+1):
        if haystack[i:i+len(needle)]==needle:
            return i
    return -1


print(strDS("sadbutsad","sad"))
print(strDS("leetcode","leeto"))
