from typing import List


def newspapers_split1(newspapers_read_times: List[int], num_coworkers: int) -> int:
    coworkers_time = []
    n = len(newspapers_read_times)
    left, right = 0, n - 1
    res = 0
    split_newpapers = n // num_coworkers
    while left <= right:
        mid = (left + right) // 2
        if len(coworkers_time) < num_coworkers - 1 and right - left == split_newpapers:
            coworkers_time.append(sum(newspapers_read_times[left:right]))
            res = max(coworkers_time)
            right = right - split_newpapers
            left = left - split_newpapers
        elif right == n - 1 and right == left:
            coworkers_time.append(sum(newspapers_read_times[left:]))
            res = max(coworkers_time)
            left = left - split_newpapers
        elif len(coworkers_time) == num_coworkers - 1:
            coworkers_time.append(sum(newspapers_read_times[:right]))
            res = max(coworkers_time)
            right = mid - 1
        else:
            left = mid + 1
    return res

def feasible(newspapers_read_times: List[int], num_coworkers: int, limit: int) -> bool:
    # time to keep track of the current worker's time spent, num_workers to keep track of the number of coworkers used
    time, num_workers = 0, 0
    for read_time in newspapers_read_times:
        # check if current time exceeds the given time limit
        if time + read_time > limit:
            time = 0
            num_workers += 1
        time += read_time
    # edge case to check if we needed an extra worker at the end
    if time != 0:
        num_workers += 1
    # check if the number of workers we need is more than what we have
    return num_workers <= num_coworkers

def newspapers_split(newspapers_read_times: List[int], num_coworkers: int) -> int:
    low, high = max(newspapers_read_times), sum(newspapers_read_times)
    ans = -1
    while low <= high:
        mid = (low + high) // 2
        # helper function to check if a time works
        if feasible(newspapers_read_times, num_coworkers, mid):
            ans = mid
            high = mid - 1
        else:
            low = mid + 1
    return ans

if __name__ == '__main__':
    newspapers_read_times = [7,2,5,10,8]
    num_coworkers = 2
    res = newspapers_split(newspapers_read_times, num_coworkers)
    print(res)
