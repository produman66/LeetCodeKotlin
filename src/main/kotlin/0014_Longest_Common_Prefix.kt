class Solution0014 {
    fun longestCommonPrefix(strs: Array<String>): String {
        var res = StringBuilder()
        if (strs.size == 1){
            return strs[0]
        }

        for (i in 0 until strs[0].length){
            for (c in 0 until strs.size){
                if (i == strs[c].length || strs[c][i] != strs[0][i]){
                    return res.toString()
                }
            }
            res.append(strs[0][i].toString())
        }
        return res.toString()
    }
}