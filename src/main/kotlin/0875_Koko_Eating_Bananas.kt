class Solution0875 {
    fun minEatingSpeed(piles: IntArray, h: Int): Int {
        var l = 1
        var r = piles.max()
        var ans = piles.max()
        while (l < r){
            var res = 0
            var m = l + (r - l)/ 2
            for (i in 0 until piles.size){
                res += (Math.ceil(piles[i]/m.toDouble())).toInt()
            }
            if (res <= h){
                if (m < ans){
                    ans = m
                }
                r = m
            }else l = m + 1
        }
        return ans
    }
}