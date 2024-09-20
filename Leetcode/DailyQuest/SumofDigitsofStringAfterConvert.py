class SumOfDigits(object):
    def getLucky(self, s, k):
        # Convert each character in the string to its corresponding numeric value
        number = ''
        for x in s:
            number += str(ord(x) - ord('a') + 1)

        # Perform the transformation `k` times
        while k > 0:
            temp = 0
            for x in number:
                temp += int(x)  # Sum the digits of the current number
            number = str(temp)  # Convert the sum back to a string
            k -= 1
        return int(number)  # Return the final result as an integer

if __name__ == "__main__":
    sumOfDigits = SumOfDigits()
    s = "hvmhoasabaymnmsd"
    print(sumOfDigits.getLucky(s, 1))
    s="iiii"
    print(sumOfDigits.getLucky(s,1))
