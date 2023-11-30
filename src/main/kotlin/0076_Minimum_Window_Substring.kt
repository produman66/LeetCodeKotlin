class Solution0076 {
    fun minWindow(s: String, t: String): String {
        val dict = mutableMapOf<Char, Int>()
        var map = mutableMapOf<Char, Int>()

        for (i in 0 until t.length){
            if (!dict.containsKey(t[i])){
                dict[t[i]] = 0
            }
            dict[t[i]] = dict[t[i]]!! + 1
        }

        var have = 0
        val need = dict.size

        var minL = 0
        var minR = 0


        var min = 10000000
        var l = 0

        for (r in 0 until s.length){

            if (!map.containsKey(s[r])) map[s[r]] = 0
            map[s[r]] = map[s[r]]!! + 1

            if (dict.containsKey(s[r]) && dict[s[r]] == map[s[r]])  have += 1

            while (have == need){
                if (r - l + 1 < min){
                    minR = r
                    minL = l
                    min = (r - l + 1)
                }

                map[s[l]] = map[s[l]]!! - 1
                if (dict.containsKey(s[l]) && dict[s[l]]!! > map[s[l]]!!){
                    have --
                }
                l+=1
            }
        }
        if (min != 10000000){
            return s.substring(minL, minR+1)
        }
        return ""

    }
}