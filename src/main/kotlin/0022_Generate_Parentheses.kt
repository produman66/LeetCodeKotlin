class Solution0022 {
    fun generateParenthesis(n: Int): List<String> {
        var ans = StringBuilder()
        var ans1 = mutableListOf<String>()
        var ans2 = per(ans, n*2, ans1)
        return ans2
    }


    fun per(ans:StringBuilder, n: Int, anwer: MutableList<String>): MutableList<String>{
        var countfr = ans.count{it == '('}
        var countsc = ans.count{it == ')'}
        if (countfr > n/2){
            return anwer
        }
        if (ans.length == n){
            anwer.add(ans.toString())
        }else if (countsc == countfr) {
            ans.append('(')
            per(ans, n, anwer)
        }else if (countsc < countfr) {
            val ans1 = StringBuilder(ans)
            ans1.append('(')
            per(ans1, n, anwer)
            ans.append(')')
            per(ans, n, anwer)
        }
        return anwer
    }
}