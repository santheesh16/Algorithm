
def findLastWord(sentence):
    return len(sentence.strip().split(" ")[-1])

sen = "Hello World"
print(findLastWord(sen))
s = "   fly me   to   the moon  "
print(findLastWord(s))