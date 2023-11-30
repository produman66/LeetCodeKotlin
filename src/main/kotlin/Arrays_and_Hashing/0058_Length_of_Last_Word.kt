package Arrays_and_Hashing

class Solution0058 {
    fun lengthOfLastWord(s: String): Int {

        var a = s.split(" ")
        for (i in a.size-1 downTo 0){
            if (a[i]!= ""){
                return a[i].length
            }
        }
        return a[a.size- 1].length
    }
}