package Arrays_and_Hashing

class Solution0605 {
    fun canPlaceFlowers(flowerbed: IntArray, n: Int): Boolean {
        if (flowerbed.size == 1 || n == 0){
            if ((flowerbed[0] == 0 && n == 1) || n == 0 ){
                return true
            }
            return false
        }
        var count = n
        var list = flowerbed
        for (i in 0 until flowerbed.size){
            if (i != 0 && i != flowerbed.size-1){
                if (list[i-1] == 0 && list[i+1] == 0){
                    if (list[i] == 0){
                        count--
                    }
                    list[i] = 1
                }
            }
            else if (i == 0 && list[i+1] == 0){
                if (list[i] == 0){
                    count--
                }
                list[i] = 1
            }
            else if (i == flowerbed.size-1 && list[i-1] == 0){
                if (list[i] == 0){
                    count--
                }
                list[i] = 1
            }
            if (count == 0){
                return true
            }
        }
        return false
    }
}