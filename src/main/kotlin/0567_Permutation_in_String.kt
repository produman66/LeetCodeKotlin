class Solution0567 {
    fun checkInclusion(s1: String, s2: String): Boolean {
        if (s1.length > s2.length){
            return false
        }
        val map = mutableMapOf<Char, Int>()
        val map1 = mutableMapOf<Char, Int>()
        for (c in 'a'..'z') {
            map[c] = 0
            map1[c] = 0
        }
        for (i in 0 until s1.length){
            map[s1[i]] = map[s1[i]]!! + 1
            map1[s2[i]] = map1[s2[i]]!! + 1
        }
        var l = 0
        var r = s1.length-1
        while (r < s2.length){
            if (map1 == map){
                return true
            }else {
                map1[s2[l]] = map1[s2[l]]!! - 1
                l++
                r++
                if (r == s2.length){
                    return false
                }
                map1[s2[r]] = map1[s2[r]]!! + 1
            }
        }
        return false
    }
}