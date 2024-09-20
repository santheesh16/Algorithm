from collections import defaultdict


def least_consecutive_cards_to_match(cards):
    window = defaultdict(int)
    shortest, left = len(cards) + 1, 0
    for right in range(len(cards)):
        window[cards[right]] += 1
        while window[cards[right]] == 2:
            shortest = min(shortest, right - left + 1)
            window[cards[left]] -= 1
            left += 1
    return shortest if shortest != len(cards) + 1 else -1


if __name__ == '__main__':
    cards = [int(x) for x in input().split()]
    res = least_consecutive_cards_to_match(cards)
    print(res)
