class Solution1189 {
    fun maxNumberOfBalloons(text: String): Int {

        val map = mutableMapOf<Char, Int>()

        map['b'] = 1
        map['o'] = 2
        map['a'] = 1
        map['l'] = 2
        map['n'] = 1

        val ans = mutableMapOf<Char, Int>()

        var count = 0

        for (i in 0 until text.length){
            if (map.containsKey(text[i])){
                if (!ans.containsKey(text[i])){
                    ans[text[i]] = 0
                }
                ans[text[i]] = ans[text[i]]!! + 1
            }
        }

        while (true){
            for (key in map.keys) {
                if (ans.containsKey(key)){
                    ans[key] = ans[key]!! - map[key]!!
                    if (ans[key]!! < 0){
                        return count
                    }
                }
                else {
                    return 0
                }

            }
            count ++
        }
        return count
    }
}