class Solution0074 {
    fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {
        for (i in 0 until matrix.size) {
            var l = 0;
            var r = matrix[i].size - 1
            while (l <= r) {
                var m = (l + r) / 2
                if (matrix[i][m] < target) l = m + 1
                else if (matrix[i][m] > target) r = m - 1
                else return true
            }
        }
        return false
    }
}