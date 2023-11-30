class Solution0020 {
    fun isValid(s: String): Boolean {
        var stack = mutableListOf<String>()
        for (i in 0 until s.length){
            if (!stack.isEmpty()){
                if (stack.lastOrNull()!!.equals("(") && s[i].toString().equals(")") || stack.lastOrNull()!!.equals("{") && s[i].toString().equals("}") || stack.lastOrNull()!!.equals("[") && s[i].toString().equals("]")){
                    stack.removeAt(stack.size-1)
                }else{
                    stack.add(s[i].toString())
                }
            }else {
                stack.add(s[i].toString())
            }
        }
        if (!stack.isEmpty()) return false
        return true
    }
}