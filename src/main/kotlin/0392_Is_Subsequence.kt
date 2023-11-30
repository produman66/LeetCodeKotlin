
class Solution392 {
    fun isSubsequence(s: String, t: String): Boolean {
        if (s.length == 0){
            return true
        }
        var l = 0
        for (r in 0 until t.length){
            if (s[l] == t[r]){
                l++
            }
            if (l == s.length) return true
        }
        return false
    }
}