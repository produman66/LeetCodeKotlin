class Solution0344 {
    fun reverseString(s: CharArray): Unit {
        var stack = mutableListOf<Char>()

        for (i in 0 until s.size){
            stack.add(s[i])
        }

        for (i in 0 until s.size){
            s[i] = stack[s.size - 1 - i]
        }
    }
}