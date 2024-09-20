
def BuyAndSell2(prices):
    profit = 0
    for i in range(len(prices) - 1):
        buy = prices[i]
        if 0 < prices[i+1] - buy:
            profit += prices[i+1] - buy
    return profit

def SellStock(prices):
    profit = 0
    buy = prices[0]
    for price in prices:
        if buy > price:
            buy = price
        else:
            profit += price - buy
            buy = price
    return profit

prices = [7,1,5,3,6,4]
print(SellStock(prices))
prices = [1,2,3,4,5]
print(SellStock(prices))
prices = [7,6,4,3,1]
print(SellStock(prices))