class Solution0049 {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val mapp = mutableMapOf<String, MutableList<String>>()
        strs.forEach{
            val sort = sorted(it)
            if (sort !in mapp){
                val ans1 = mutableListOf<String>()
                ans1.add(it)
                mapp[sort] = ans1
            }else {
                mapp[sort]?.add(it)
            }
        }
        return mapp.values.toList()

    }

    fun sorted(str: String): String{
        return str.toCharArray().sorted().joinToString("")
    }
}