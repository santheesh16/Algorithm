

def isPalindrom(x):
    return list(str(int(''.join(str(num) for num in x)) + 1))

x = [1,2,3]
print(isPalindrom(x))