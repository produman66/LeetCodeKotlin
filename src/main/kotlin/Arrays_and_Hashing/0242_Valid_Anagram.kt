package Arrays_and_Hashing

class Solution0242 {
    fun isAnagram(s: String, t: String): Boolean {
        val dict = mutableMapOf<String, Int>();
        val dict1 = mutableMapOf<String, Int>();
        if (s.length != t.length){
            return false
        }
        for (i in 0 until s.length) {
            if (s[i].toString() in dict){
                dict[s[i].toString()] = dict[s[i].toString()]!! + 1
            }else{
                dict[s[i].toString()] = 1
            }
        }

        for (i in 0 until t.length) {
            if (t[i].toString() in dict1){
                dict1[t[i].toString()] = dict1[t[i].toString()]!! + 1
            }else{
                dict1[t[i].toString()] = 1
            }
        }

        for (i in 0 until s.length){
            if (dict[s[i].toString()] != (dict1[s[i].toString()])){
                return false
            }
        }
        return true
    }
}