def mergeSortArray(nums1, m, nums2, n):
    if n == 0 :return
    len1 = len(nums1)
    end_idx = len1-1
    while n > 0 and m > 0 :
        if nums2[n-1] >= nums1[m-1]:
            nums1[end_idx] = nums2[n-1]
            n-=1
        else:
            nums1[end_idx] = nums1[m-1]
            m-=1
        end_idx-=1
    while n > 0:
        nums1[end_idx] = nums2[n-1]
        n-=1
        end_idx-=1
    return nums1


nums1 = [1,2,3,0,0,0]
m = len(nums1)
nums2 = [2, 5, 6]
n = len(nums2)
print(mergeSortArray(nums1, 3, nums2, 3))
