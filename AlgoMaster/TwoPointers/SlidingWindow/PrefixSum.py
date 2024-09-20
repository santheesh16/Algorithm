def prefix_sum_array(arr):
    prefix_sum = [0]
    for num in arr:
        prefix_sum.append(prefix_sum[-1] + num)
    return prefix_sum

arr = [1, -20, -3, 30, 5, 4]
print(prefix_sum_array(arr))