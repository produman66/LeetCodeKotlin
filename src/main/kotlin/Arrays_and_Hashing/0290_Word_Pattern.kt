package Arrays_and_Hashing

class Solution0290 {
    fun wordPattern(pattern: String, s: String): Boolean {
        var count = s.split(" ")

        if (pattern.length != count.size){
            return false
        }
        val map = mutableMapOf< String, Char>()
        var set = mutableSetOf<Char>()

        for (i in 0 until pattern.length){
            if (map.containsKey(count[i])){
                if (map[count[i]] != pattern[i]){
                    return false
                }
            }
            if (!map.containsKey(count[i]) && (pattern[i] in set)){
                return false
            }
            if (pattern[i] !in set){
                set.add(pattern[i])
            }
            map[count[i]] = pattern[i]
        }
        return true
    }
}