class Solution0167 {
    fun twoSum(numbers: IntArray, target: Int): IntArray {
        var mass = mutableListOf<Int>()
        for (first in 0 until numbers.size){
            var last = first+1
            while ((last < numbers.size-1) && (numbers[last] + numbers[first] < target)){
                last ++
            }
            if (numbers[last] + numbers[first] == target) {
                mass.add(first+1)
                mass.add(last+1)
                return mass.toIntArray()
            }
        }
        return mass.toIntArray()
    }
}