def isValid(s):
    if len(s) % 2 != 0:
        return False
    params = [char for char in s]
    stack = []
    for param in params:
        if "{" == param:
            stack.append(param)
        elif "}" == param and stack[0] == "{":
            stack.pop("}")
        elif "(" == param:
            stack.append(param)
        elif ")" == param and stack[0] == "(":
            stack.pop("")
        elif "[" == param:
            stack.append(param)
        elif "]" == param and stack[0] == "[":
            stack.pop(param)
    return len(stack) == 0 if True else False


if __name__ == '__main__':
    param = "()"
    res = isValid(param)
    print(res)
