class MinStack() {

    var ans = mutableListOf<Int>()

    fun push(`val`: Int) {
        ans.add(`val`)
    }

    fun pop() {
        ans.removeAt(ans.size-1)
    }

    fun top(): Int {
        return ans[ans.size-1]
    }

    fun getMin(): Int {
        var ans1 = mutableListOf<Int>()
        ans1.add(ans[0])
        for (i in 1 until ans.size){
            if (ans[i] < ans1[ans1.size-1]){
                ans1.add(ans[i])
            }
        }
        return ans1[ans1.size-1]
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * var obj = MinStack()
 * obj.push(`val`)
 * obj.pop()
 * var param_3 = obj.top()
 * var param_4 = obj.getMin()
 */