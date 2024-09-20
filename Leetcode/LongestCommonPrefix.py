
def findLongPrefix(arr):

    fstr = arr[0]
    commonStr = ""
    if len(arr) <= 1:
        return commonStr
    for l in range(len(fstr)+1):
        j = 1
        while j < len(arr):
            if fstr[0:l] != arr[j][:l]:
                return fstr[:l-1]
            commonStr = fstr[:l]
            j += 1
    return commonStr

def longestCommonPrefix(self, strs):
    if not strs:
        return ""
    prefix = strs[0]
    for i in range(1, len(strs)):
        while not strs[i].startswith(prefix):
            prefix = prefix[:-1]
    return prefix

def longestCommonPrefix(strings):
    # Assumes the input list of strings is not empty
    # The outer loop goes through each character of the first string
    for index in range(len(strings[0])):
        # Inner loop checks the character at the current position across all other strings
        for string in strings[1:]:
            # Checks if we've reached the end of any string or a character mismatch is found
            if index >= len(string) or string[index] != strings[0][index]:
                # Return the longest common prefix found so far
                return strings[0][:index]
    # If no early return happened, the first string itself is the common prefix
    return strings[0]

arr = ["flower","flow","flight"]
print(longestCommonPrefix(arr))
# arr = ["dog","racecar","car"]
# print(longestCommonPrefix(arr))
# arr = ["flower","flower","flower","flower"]
# print(longestCommonPrefix(arr))