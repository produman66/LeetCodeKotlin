class Solution0853 {
    fun carFleet(target: Int, position: IntArray, speed: IntArray): Int {
        quickSortDescending(position, 0, position.size - 1, speed)
        var sum = 0
        var stack = mutableListOf<Double>()
        for (i in 0 until speed.size){
            var count = 0
            var ans1:Double = 0.0
            ans1 = (target - position[i])/speed[i].toDouble()
            while (!stack.isEmpty() && stack.first() < ans1){
                stack.clear()
                count = 1
            }
            sum += count
            stack.add(ans1)
        }
        if (!stack.isEmpty()){
            sum++
        }
        return sum
    }
    fun quickSortDescending(arr: IntArray, low: Int, high: Int, speed: IntArray) {
        if (low < high) {
            val pivotIndex = partition(arr, low, high, speed)
            quickSortDescending(arr, low, pivotIndex - 1, speed)
            quickSortDescending(arr, pivotIndex + 1, high, speed)
        }
    }

    fun partition(arr: IntArray, low: Int, high: Int, speed: IntArray): Int {
        val pivot = arr[high]
        var i = low - 1

        for (j in low until high) {
            if (arr[j] >= pivot) {
                i++
                swap(arr, i, j)
                swap(speed, i, j)
            }
        }

        swap(arr, i + 1, high)
        swap(speed, i + 1, high)
        return i + 1
    }

    fun swap(arr: IntArray, i: Int, j: Int) {
        val temp = arr[i]
        arr[i] = arr[j]
        arr[j] = temp
    }
}