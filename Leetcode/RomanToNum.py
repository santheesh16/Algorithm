
# Symbol       Value
# I             1
# V             5
# X             10
# L             50
# C             100
# D             500
# M             1000
#IV - 4
#VI - 6



def changeToNum(roman):
    num = 0
    for i in roman:
        if "I" == i:
            num += 1
        elif "V" == i:
            num += 5
        elif "X" == i:
            num += 10
        elif "L" == i:
            num += 50
        elif "C" == i:
            num += 100
        elif "D" == i:
            num += 500
        elif "M" == i:

    return num





# str = "LVIII"
# print(changeToNum(str))
str = "MCMXCIV" #1994 M=1000 CM=900 XC=90 IV=4
print(changeToNum(str))
# str = "III"
# print(changeToNum(str))