
#[7,1,5,3,6,4]
#[7,6,4,3,1]


def BuyAndSell(prices):

    buy = prices[0]
    profit = 0
    for price in prices[1:]:
        if buy > price:
            buy = price

        profit = max(profit, price - buy)
    return profit



nums = [7,1,5,3,6,4]
# [7,6,4,3,1]
print(BuyAndSell(nums))



