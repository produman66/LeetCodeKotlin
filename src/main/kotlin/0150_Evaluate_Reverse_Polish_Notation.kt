class Solution0150 {
    fun evalRPN(tokens: Array<String>): Int {
        var stack = mutableListOf<Int>()
        for (i in 0 until tokens.size) {
            if (tokens[i] == "-" || tokens[i] == "+" ||
                tokens[i] == "/" || tokens[i] == "*"){
                var a = stack.last()
                stack.removeLast()
                var b = stack.last()
                stack.removeLast()
                if (tokens[i] == "-") stack.add(b - a)
                else if (tokens[i] == "+") stack.add(a + b)
                else if (tokens[i] == "*") stack.add(a * b)
                else if (tokens[i] == "/") stack.add(b / a)
            }
            else stack.add(tokens[i].toInt())
        }
        return stack.last()
    }
}