class Solution1768 {
    fun mergeAlternately(word1: String, word2: String): String {
        var ans = StringBuilder()
        var j = 0
        var k = 0

        while (j < word1.length && k < word2.length){
            if (j <= k){
                ans.append(word1[j])
                j++
            }else {
                ans.append(word2[k])
                k++
            }
        }

        while (j < word1.length){
            ans.append(word1[j])
            j++
        }
        while (k < word2.length){
            ans.append(word2[k])
            k++
        }

        return ans.toString()
    }
}