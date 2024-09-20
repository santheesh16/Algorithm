import re

def countSeniors(details):
    count = 0

    for i in details:
        if int(re.split(r'(M|F)',i)[2][0:2]) > 60:
            count += 1
    return count

details = ["5612624052M0130","5378802576M6424","5447619845F0171","2941701174O9078"]
print(countSeniors(details))