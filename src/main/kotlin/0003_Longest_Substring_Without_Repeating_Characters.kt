import java.lang.Integer.max

class Solution0003 {
    fun lengthOfLongestSubstring(s: String): Int {
        var alphabet = mutableSetOf<Char>()
        var r = 0
        var max = 0
        while (r < s.length){
            while (alphabet.contains(s[r])){
                alphabet.remove(alphabet.first())
            }
            alphabet.add(s[r])
            r++
            max = max(max, alphabet.size)

        }
        return max
    }
}