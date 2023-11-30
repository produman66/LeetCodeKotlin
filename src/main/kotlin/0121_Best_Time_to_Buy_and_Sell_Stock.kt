import java.lang.Integer.max

class Solution0121 {
    fun maxProfit(prices: IntArray): Int {
        if (prices.size<=1){
            return 0
        }
        var start = 0
        var end = 1
        var maxR = max(prices[end] - prices[start], 0)
        while (end < prices.size) {
            if (prices[start] < prices[end]){
                maxR = max(prices[end] - prices[start], maxR)
                end ++
            }else {
                start = end
                end += 1
            }
        }
        return maxR
    }
}