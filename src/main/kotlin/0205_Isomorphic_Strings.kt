class Solution0205 {
    fun isIsomorphic(s: String, t: String): Boolean {

        val mapS = mutableMapOf<Char, Char>()
        val mapT = mutableMapOf<Char, Char>()

        for (i in s.indices) {
            val charS = s[i]
            val charT = t[i]

            if (mapS.containsKey(charS) && mapS[charS] != charT) return false
            if (mapT.containsKey(charT) && mapT[charT] != charS) return false

            mapS[charS] = charT
            mapT[charT] = charS
        }
        return true
    }
}