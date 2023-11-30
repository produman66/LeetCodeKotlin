class Solution0118 {
    fun generate(numRows: Int): List<List<Int>> {
        var count = 1
        var ans = mutableListOf<MutableList<Int>>()
        for (i in 0 until numRows){
            var ls = mutableListOf<Int>()
            for (j in 0 until count){
                if (j == 0){
                    ls.add(1)
                }else if(i == 1) {
                    ls.add(1)
                }else if (j == count - 1){
                    ls.add(1)
                }else{
                    ls.add(ans[i-1][j-1] + ans[i-1][j])
                }
            }
            count++
            ans.add(ls)
        }
        return ans.toList()
    }
}